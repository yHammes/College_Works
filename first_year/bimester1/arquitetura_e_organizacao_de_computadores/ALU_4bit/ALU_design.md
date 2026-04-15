# ALU de 4 bits com DEMUX e MUX

## Visão Geral

ALU (Unidade Lógica e Aritmética) de 4 bits que realiza 5 operações utilizando DEMUX para direcionar os cálculos e MUX para selecionar o resultado.

---

## Especificações

| Item | Descrição |
|------|-----------|
| Entradas de dados | A[3:0] e B[3:0] (2 entradas de 4 bits) |
| Controle | SEL[2:0] (3 bits de controle) |
| Saída principal | RESULT[3:0] (1 saída de 4 bits) |
| Saídas de 1 bit | CARRY_OUT, ZERO, OVERFLOW |

---

## Tabela de Operações

| SEL[2:0] | Operação | Descrição |
|----------|----------|-----------|
| 000 | SOMA | A + B |
| 001 | SUBTRAÇÃO | A - B |
| 010 | AND | A & B |
| 011 | OR | A \| B |
| 100 | XOR | A ^ B |
| 101-111 | (reservado) | Saída = 0000 |

---

## Arquitetura

```
        A[3:0]    B[3:0]    SEL[2:0]
          |          |          |
          v          v          v
       +-----------------------------+
       |          DEMUX 1:5          |
       |   (direciona os operandos   |
       |    para o bloco correto)    |
       +-----------------------------+
          |    |    |    |    |
          v    v    v    v    v
       +----+----+----+----+----+
       |ADD |SUB |AND | OR |XOR |
       |4bit|4bit|4bit|4bit|4bit|
       +----+----+----+----+----+
          |    |    |    |    |
          v    v    v    v    v
       +-----------------------------+
       |          MUX 5:1            |
       |   (seleciona o resultado    |
       |    da operação escolhida)   |
       +-----------------------------+
                   |
                   v
             RESULT[3:0]
             CARRY_OUT
             ZERO
             OVERFLOW
```

### Funcionamento

1. **DEMUX (Demultiplexador)**: Recebe o sinal de controle SEL[2:0] e habilita apenas o bloco de operação correspondente. Os operandos A e B são direcionados para o módulo correto (somador, subtrator, AND, OR ou XOR).

2. **Blocos de Operação**: Cada bloco calcula sua respectiva operação com os 4 bits de entrada. Todos recebem A e B, mas apenas o bloco habilitado pelo DEMUX produz resultado válido.

3. **MUX (Multiplexador)**: Recebe os resultados de todos os 5 blocos e, com base no mesmo sinal SEL[2:0], seleciona qual resultado será enviado para a saída RESULT[3:0].

### Flags de Saída (1 bit cada)

- **CARRY_OUT**: Indica vai-um na soma ou subtração (transbordo sem sinal).
- **ZERO**: Ativa quando RESULT = 0000.
- **OVERFLOW**: Indica estouro em operações com sinal (complemento de 2).

---

## Detalhamento dos Blocos

### Somador de 4 bits (Ripple Carry Adder)
- Cascata de 4 Full Adders
- Carry-in = 0
- Carry-out do último FA = CARRY_OUT

### Subtrator de 4 bits
- Utiliza complemento de 2: A - B = A + (~B) + 1
- Mesma estrutura do somador, com B invertido e Carry-in = 1

### AND, OR, XOR de 4 bits
- Operações bit a bit aplicadas em cada par de bits A[i] e B[i]
- Sem carry ou overflow (apenas operações lógicas)
