// ============================================================
// ALU de 4 bits com DEMUX e MUX
// Operações: SOMA, SUBTRAÇÃO, AND, OR, XOR
// Entradas: A[3:0], B[3:0], SEL[2:0]
// Saída principal: RESULT[3:0]
// Saídas de 1 bit: CARRY_OUT, ZERO, OVERFLOW
// ============================================================

// ---- Full Adder ----
module full_adder(
    input  a,
    input  b,
    input  cin,
    output sum,
    output cout
);
    assign sum  = a ^ b ^ cin;
    assign cout = (a & b) | (a & cin) | (b & cin);
endmodule

// ---- Somador 4 bits (Ripple Carry) ----
module adder_4bit(
    input  [3:0] a,
    input  [3:0] b,
    input        cin,
    output [3:0] sum,
    output       cout
);
    wire c1, c2, c3;

    full_adder fa0(.a(a[0]), .b(b[0]), .cin(cin), .sum(sum[0]), .cout(c1));
    full_adder fa1(.a(a[1]), .b(b[1]), .cin(c1),  .sum(sum[1]), .cout(c2));
    full_adder fa2(.a(a[2]), .b(b[2]), .cin(c2),  .sum(sum[2]), .cout(c3));
    full_adder fa3(.a(a[3]), .b(b[3]), .cin(c3),  .sum(sum[3]), .cout(cout));
endmodule

// ---- DEMUX 1:5 (habilita o bloco correto) ----
module demux_1to5(
    input  [2:0] sel,
    output       en_add,
    output       en_sub,
    output       en_and,
    output       en_or,
    output       en_xor
);
    assign en_add = (sel == 3'b000);
    assign en_sub = (sel == 3'b001);
    assign en_and = (sel == 3'b010);
    assign en_or  = (sel == 3'b011);
    assign en_xor = (sel == 3'b100);
endmodule

// ---- MUX 5:1 de 4 bits (seleciona o resultado) ----
module mux_5to1_4bit(
    input  [2:0] sel,
    input  [3:0] in0,
    input  [3:0] in1,
    input  [3:0] in2,
    input  [3:0] in3,
    input  [3:0] in4,
    output reg [3:0] out
);
    always @(*) begin
        case (sel)
            3'b000:  out = in0;
            3'b001:  out = in1;
            3'b010:  out = in2;
            3'b011:  out = in3;
            3'b100:  out = in4;
            default: out = 4'b0000;
        endcase
    end
endmodule

// ---- MUX 5:1 de 1 bit (para carry) ----
module mux_5to1_1bit(
    input  [2:0] sel,
    input        in0,
    input        in1,
    input        in2,
    input        in3,
    input        in4,
    output reg   out
);
    always @(*) begin
        case (sel)
            3'b000:  out = in0;
            3'b001:  out = in1;
            3'b010:  out = in2;
            3'b011:  out = in3;
            3'b100:  out = in4;
            default: out = 1'b0;
        endcase
    end
endmodule

// ============================================================
// ALU Principal
// ============================================================
module alu_4bit(
    input  [3:0] A,
    input  [3:0] B,
    input  [2:0] SEL,
    output [3:0] RESULT,
    output       CARRY_OUT,
    output       ZERO,
    output       OVERFLOW
);

    // --- Sinais do DEMUX ---
    wire en_add, en_sub, en_and, en_or, en_xor;

    demux_1to5 demux(
        .sel(SEL),
        .en_add(en_add),
        .en_sub(en_sub),
        .en_and(en_and),
        .en_or(en_or),
        .en_xor(en_xor)
    );

    // --- Resultados de cada operação ---
    wire [3:0] res_add, res_sub, res_and, res_or, res_xor;
    wire       cout_add, cout_sub;

    // SOMA: A + B (carry_in = 0)
    adder_4bit soma(
        .a(A), .b(B), .cin(1'b0),
        .sum(res_add), .cout(cout_add)
    );

    // SUBTRAÇÃO: A + (~B) + 1 (complemento de 2)
    adder_4bit subtracao(
        .a(A), .b(~B), .cin(1'b1),
        .sum(res_sub), .cout(cout_sub)
    );

    // AND bit a bit
    assign res_and = A & B;

    // OR bit a bit
    assign res_or = A | B;

    // XOR bit a bit
    assign res_xor = A ^ B;

    // --- MUX para selecionar resultado de 4 bits ---
    mux_5to1_4bit mux_result(
        .sel(SEL),
        .in0(res_add),
        .in1(res_sub),
        .in2(res_and),
        .in3(res_or),
        .in4(res_xor),
        .out(RESULT)
    );

    // --- MUX para selecionar carry out ---
    mux_5to1_1bit mux_carry(
        .sel(SEL),
        .in0(cout_add),
        .in1(~cout_sub),  // borrow na subtração
        .in2(1'b0),
        .in3(1'b0),
        .in4(1'b0),
        .out(CARRY_OUT)
    );

    // --- Flags ---
    assign ZERO = (RESULT == 4'b0000);

    // Overflow: ocorre quando o sinal do resultado é inconsistente
    // com os sinais das entradas (apenas para soma e subtração)
    wire overflow_add = (A[3] == B[3])    && (res_add[3] != A[3]);
    wire overflow_sub = (A[3] != B[3])    && (res_sub[3] != A[3]);

    assign OVERFLOW = (SEL == 3'b000) ? overflow_add :
                      (SEL == 3'b001) ? overflow_sub :
                      1'b0;

endmodule
