-- Criar banco de dados
CREATE DATABASE projetoControleDeEstoque;

-- Conectar ao banco de dados
\c projetoControleDeEstoque

-- Criar tabela Clientes com campos opcionais
CREATE TABLE Clientes (
    cpf CHAR(14) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    telefone VARCHAR(16),
    email VARCHAR(100)
);

-- Criar tabela Produtos
CREATE TABLE Produtos (
    id SERIAL PRIMARY KEY,
    valor DECIMAL(10, 2) NOT NULL,
    quantidade INT NOT NULL,
    nome VARCHAR(100) NOT NULL,
    descricao TEXT
);

-- Criar tabela Vendas com novos campos
CREATE TABLE Vendas (
    id SERIAL PRIMARY KEY,
    cliente_cpf CHAR(14) REFERENCES Clientes(cpf),
    produto_id INT NOT NULL,
    nome_produto VARCHAR(100),
    quantidade_vendida INT NOT NULL,
    valor_unitario DECIMAL(10, 2) NOT NULL,
    valor_total DECIMAL(10, 2) GENERATED ALWAYS AS (quantidade_vendida * valor_unitario) STORED,
    data_venda TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Exemplo de inserção de dados

-- Inserir clientes
INSERT INTO Clientes (cpf, nome, telefone, email) VALUES ('12345678901', 'João Silva', '11123456789', 'joao.silva@example.com');
INSERT INTO Clientes (cpf, nome, telefone, email) VALUES ('09876543210', 'Maria Oliveira', '11987654321', 'maria.oliveira@example.com');

-- Inserir produtos
INSERT INTO Produtos (valor, quantidade, nome, descricao) VALUES (29.99, 100, 'Caneta', 'Caneta esferográfica azul');
INSERT INTO Produtos (valor, quantidade, nome, descricao) VALUES (59.99, 50, 'Caderno', 'Caderno de 10 matérias, capa dura');

-- Inserir vendas
INSERT INTO Vendas (cliente_cpf, produto_id, nome_produto, quantidade_vendida, valor_unitario)
SELECT '12345678901', p.id, p.nome, 5, p.valor FROM Produtos p WHERE p.id = 1; -- 5 unidades da Caneta vendidas a 29.99 cada
INSERT INTO Vendas (cliente_cpf, produto_id, nome_produto, quantidade_vendida, valor_unitario)
SELECT '09876543210', p.id, p.nome, 2, p.valor FROM Produtos p WHERE p.id = 2; -- 2 unidades do Caderno vendidas a 59.99 cada

-- Consultar dados
SELECT * FROM Clientes;
SELECT * FROM Produtos;
SELECT * FROM Vendas;