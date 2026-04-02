Marcio Adriano Hammes
02/04/2026

CREATE TABLE: Cria uma nova tabela no banco de dados.

CREATE TABLE cliente (
    id INT PRIMARY KEY,
    nome VARCHAR(255),
    email VARCHAR(255),
    cpf VARCHAR(11)
);

CREATE TABLE produto (
    id INT PRIMARY KEY,
    title VARCHAR(255),
    description TEXT
);

CREATE TABLE compra (
    id INT PRIMARY KEY,
    cliente_id INT,
    produto_id INT,
    quantidade INT,
    data_compra DATE
);

CREATE TABLE estoque (
    id INT PRIMARY KEY,
    produto_id INT,
    amount INT
);

CREATE TABLE funcionario (
    id INT PRIMARY KEY,
    name VARCHAR(255),
    email VARCHAR(255)
);

CREATE TABLE gerente (
    id INT PRIMARY KEY,
    name VARCHAR(255),
    email VARCHAR(255),
    funcionario_id INT
);
