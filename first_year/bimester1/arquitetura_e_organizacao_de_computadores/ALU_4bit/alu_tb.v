// ============================================================
// Testbench para ALU de 4 bits
// ============================================================

`timescale 1ns / 1ps

module alu_tb;

    reg  [3:0] A, B;
    reg  [2:0] SEL;
    wire [3:0] RESULT;
    wire       CARRY_OUT, ZERO, OVERFLOW;

    alu_4bit uut(
        .A(A), .B(B), .SEL(SEL),
        .RESULT(RESULT),
        .CARRY_OUT(CARRY_OUT),
        .ZERO(ZERO),
        .OVERFLOW(OVERFLOW)
    );

    initial begin
        $display("=== Testbench ALU 4 bits ===");
        $display("SEL | A    | B    | RESULT | CARRY | ZERO | OVERFLOW | Operação");
        $display("----|------|------|--------|-------|------|----------|----------");

        // --- SOMA (SEL = 000) ---
        SEL = 3'b000; A = 4'b0011; B = 4'b0101; #10;
        $display("%b  | %b | %b | %b   | %b     | %b    | %b        | SOMA 3+5=%0d", SEL, A, B, RESULT, CARRY_OUT, ZERO, OVERFLOW, RESULT);

        SEL = 3'b000; A = 4'b1111; B = 4'b0001; #10;
        $display("%b  | %b | %b | %b   | %b     | %b    | %b        | SOMA 15+1 (carry)", SEL, A, B, RESULT, CARRY_OUT, ZERO, OVERFLOW);

        // --- SUBTRAÇÃO (SEL = 001) ---
        SEL = 3'b001; A = 4'b0111; B = 4'b0011; #10;
        $display("%b  | %b | %b | %b   | %b     | %b    | %b        | SUB 7-3=%0d", SEL, A, B, RESULT, CARRY_OUT, ZERO, OVERFLOW, RESULT);

        SEL = 3'b001; A = 4'b0011; B = 4'b0011; #10;
        $display("%b  | %b | %b | %b   | %b     | %b    | %b        | SUB 3-3 (zero)", SEL, A, B, RESULT, CARRY_OUT, ZERO, OVERFLOW);

        // --- AND (SEL = 010) ---
        SEL = 3'b010; A = 4'b1100; B = 4'b1010; #10;
        $display("%b  | %b | %b | %b   | %b     | %b    | %b        | AND", SEL, A, B, RESULT, CARRY_OUT, ZERO, OVERFLOW);

        // --- OR (SEL = 011) ---
        SEL = 3'b011; A = 4'b1100; B = 4'b1010; #10;
        $display("%b  | %b | %b | %b   | %b     | %b    | %b        | OR", SEL, A, B, RESULT, CARRY_OUT, ZERO, OVERFLOW);

        // --- XOR (SEL = 100) ---
        SEL = 3'b100; A = 4'b1100; B = 4'b1010; #10;
        $display("%b  | %b | %b | %b   | %b     | %b    | %b        | XOR", SEL, A, B, RESULT, CARRY_OUT, ZERO, OVERFLOW);

        SEL = 3'b100; A = 4'b1111; B = 4'b1111; #10;
        $display("%b  | %b | %b | %b   | %b     | %b    | %b        | XOR (iguais=zero)", SEL, A, B, RESULT, CARRY_OUT, ZERO, OVERFLOW);

        $display("\n=== Fim do Testbench ===");
        $finish;
    end

endmodule
