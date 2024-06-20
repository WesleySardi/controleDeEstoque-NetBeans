package org.example.interactions;

import org.example.connection.JDBCConnection;
import org.example.tables.Clientes;
import org.example.tables.Produtos;
import org.example.tables.Vendas;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SystemInteractions {

    public static void main(String[] args) {
        try (Connection connection = JDBCConnection.getConnection()) {
            // Operações CRUD aqui
            SystemInteractions interacoes = new SystemInteractions();
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }

    public void criarCliente(Clientes cliente) throws SQLException {
        String sql = "INSERT INTO Clientes (cpf, nome, telefone, email) VALUES (?, ?, ?, ?)";
        try (Connection connection = JDBCConnection.getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, cliente.getCpf());
            statement.setString(2, cliente.getNome());
            statement.setString(3, cliente.getTelefone());
            statement.setString(4, cliente.getEmail());
            statement.executeUpdate();
        }
    }

    public Clientes lerCliente(String cpf) throws SQLException {
        String sql = "SELECT * FROM Clientes WHERE cpf = ?";
        try (Connection connection = JDBCConnection.getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, cpf);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    Clientes cliente = new Clientes();
                    cliente.setCpf(resultSet.getString("cpf"));
                    cliente.setNome(resultSet.getString("nome"));
                    cliente.setTelefone(resultSet.getString("telefone"));
                    cliente.setEmail(resultSet.getString("email"));
                    return cliente;
                }
            }
        }
        return null;
    }

    public void atualizarCliente(Clientes cliente) throws SQLException {
        String sql = "UPDATE Clientes SET nome = ?, telefone = ?, email = ? WHERE cpf = ?";
        try (Connection connection = JDBCConnection.getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, cliente.getNome());
            statement.setString(2, cliente.getTelefone());
            statement.setString(3, cliente.getEmail());
            statement.setString(4, cliente.getCpf());
            statement.executeUpdate();
        }
    }

    public void excluirCliente(String cpf) throws SQLException {
        String sql = "DELETE FROM Clientes WHERE cpf = ?";
        try (Connection connection = JDBCConnection.getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, cpf);
            statement.executeUpdate();
        }
    }

    public List<Clientes> visualizarClientes() {
        List<Clientes> clientes = new ArrayList<>();
        String sql = "SELECT * FROM Clientes";
        try (Connection connection = JDBCConnection.getConnection(); Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                Clientes cliente = new Clientes();
                cliente.setCpf(resultSet.getString("cpf"));
                cliente.setNome(resultSet.getString("nome"));
                cliente.setTelefone(resultSet.getString("telefone"));
                cliente.setEmail(resultSet.getString("email"));
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return clientes;
    }

    public List<Clientes> visualizarClientesPorNome(String prefixo) {
        List<Clientes> clientes = new ArrayList<>();
        String sql = "SELECT * FROM Clientes WHERE LOWER(nome) LIKE LOWER(?)"; // Usando LOWER para tornar a pesquisa case insensitive
        try (Connection connection = JDBCConnection.getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, prefixo.toLowerCase() + "%"); // Convertendo o prefixo para minúsculas antes de passar para a consulta
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Clientes cliente = new Clientes();
                    cliente.setCpf(resultSet.getString("cpf"));
                    cliente.setNome(resultSet.getString("nome"));
                    cliente.setTelefone(resultSet.getString("telefone"));
                    cliente.setEmail(resultSet.getString("email"));
                    clientes.add(cliente);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return clientes;
    }

    public void criarProduto(Produtos produto) throws SQLException {
        String sql = "INSERT INTO Produtos (valor, quantidade, nome, descricao) VALUES (?, ?, ?, ?)";
        try (Connection connection = JDBCConnection.getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setDouble(1, produto.getValor());
            statement.setInt(2, produto.getQuantidade());
            statement.setString(3, produto.getNome());
            statement.setString(4, produto.getDescricao());
            statement.executeUpdate();
        }
    }

    public Produtos lerProduto(int id) throws SQLException {
        String sql = "SELECT * FROM Produtos WHERE id = ?";
        try (Connection connection = JDBCConnection.getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    Produtos produto = new Produtos();
                    produto.setId(resultSet.getInt("id"));
                    produto.setValor(resultSet.getDouble("valor"));
                    produto.setQuantidade(resultSet.getInt("quantidade"));
                    produto.setNome(resultSet.getString("nome"));
                    produto.setDescricao(resultSet.getString("descricao"));
                    return produto;
                }
            }
        }
        return null;
    }

    public void atualizarProduto(Produtos produto) throws SQLException {
        if (produto.getQuantidade() < 0) {
            throw new IllegalArgumentException("A quantidade não pode ser menor que zero.");
        }

        String sql = "UPDATE Produtos SET valor = ?, quantidade = ?, nome = ?, descricao = ? WHERE id = ?";
        try (Connection connection = JDBCConnection.getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setDouble(1, produto.getValor());
            statement.setInt(2, produto.getQuantidade());
            statement.setString(3, produto.getNome());
            statement.setString(4, produto.getDescricao());
            statement.setInt(5, produto.getId());
            statement.executeUpdate();
        }
    }

    public void excluirProduto(int id) throws SQLException {
        String sql = "DELETE FROM Produtos WHERE id = ?";
        try (Connection connection = JDBCConnection.getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        }
    }

    public List<Produtos> visualizarProdutos() {
        List<Produtos> produtos = new ArrayList<>();
        String sql = "SELECT * FROM Produtos";
        try (Connection connection = JDBCConnection.getConnection(); Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                Produtos produto = new Produtos();
                produto.setId(resultSet.getInt("id"));
                produto.setValor(resultSet.getDouble("valor"));
                produto.setQuantidade(resultSet.getInt("quantidade"));
                produto.setNome(resultSet.getString("nome"));
                produto.setDescricao(resultSet.getString("descricao"));
                produtos.add(produto);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return produtos;
    }

    public List<Produtos> visualizarProdutosPorNome(String prefixo) {
        List<Produtos> produtos = new ArrayList<>();
        String sql = "SELECT * FROM Produtos WHERE LOWER(nome) LIKE LOWER(?)"; // Usando LOWER para tornar a pesquisa case insensitive
        try (Connection connection = JDBCConnection.getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, prefixo.toLowerCase() + "%"); // Convertendo o prefixo para minúsculas antes de passar para a consulta
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Produtos produto = new Produtos();
                    produto.setId(resultSet.getInt("id"));
                    produto.setValor(resultSet.getDouble("valor"));
                    produto.setQuantidade(resultSet.getInt("quantidade"));
                    produto.setNome(resultSet.getString("nome"));
                    produto.setDescricao(resultSet.getString("descricao"));
                    produtos.add(produto);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return produtos;
    }

    public void criarVenda(Vendas venda) throws SQLException {
        String sqlInsertVenda = "INSERT INTO Vendas (cliente_cpf, produto_id, nome_produto, quantidade_vendida, valor_unitario) "
                + "SELECT ?, ?, p.nome, ?, p.valor FROM Produtos p WHERE p.id = ?";
        String sqlUpdateProduto = "UPDATE Produtos SET quantidade = quantidade - ? WHERE id = ? AND quantidade >= ?";

        String sqlCheckCliente = "SELECT 1 FROM Clientes WHERE cpf = ?";
        String sqlCheckProduto = "SELECT quantidade FROM Produtos WHERE id = ?";

        Connection connection = null;
        PreparedStatement insertStatement = null;
        PreparedStatement updateStatement = null;
        PreparedStatement checkClienteStatement = null;
        PreparedStatement checkProdutoStatement = null;

        try {
            connection = JDBCConnection.getConnection();
            connection.setAutoCommit(false);

            // Verificar se o cliente existe
            checkClienteStatement = connection.prepareStatement(sqlCheckCliente);
            checkClienteStatement.setString(1, venda.getClienteCpf());
            ResultSet clienteResult = checkClienteStatement.executeQuery();
            if (!clienteResult.next()) {
                throw new IllegalArgumentException("Cliente com CPF " + venda.getClienteCpf() + " não encontrado.");
            }

            // Verificar se o produto existe e se a quantidade é suficiente
            checkProdutoStatement = connection.prepareStatement(sqlCheckProduto);
            checkProdutoStatement.setInt(1, venda.getProdutoId());
            ResultSet produtoResult = checkProdutoStatement.executeQuery();
            if (!produtoResult.next()) {
                throw new IllegalArgumentException("Produto com ID " + venda.getProdutoId() + " não encontrado.");
            }
            int quantidadeDisponivel = produtoResult.getInt("quantidade");
            if (quantidadeDisponivel < venda.getQuantidadeVendida()) {
                throw new SQLException("Não existem produtos suficientes.");
            }

            // Inserir a venda
            insertStatement = connection.prepareStatement(sqlInsertVenda);
            insertStatement.setString(1, venda.getClienteCpf());
            insertStatement.setInt(2, venda.getProdutoId());
            insertStatement.setInt(3, venda.getQuantidadeVendida());
            insertStatement.setInt(4, venda.getProdutoId());
            insertStatement.executeUpdate();

            // Atualizar a quantidade do produto
            updateStatement = connection.prepareStatement(sqlUpdateProduto);
            updateStatement.setInt(1, venda.getQuantidadeVendida());
            updateStatement.setInt(2, venda.getProdutoId());
            updateStatement.setInt(3, venda.getQuantidadeVendida());
            int rowsUpdated = updateStatement.executeUpdate();

            if (rowsUpdated > 0) {
                connection.commit();
            } else {
                connection.rollback();
                throw new SQLException("Erro ao atualizar a quantidade do produto.");
            }
        } catch (SQLException e) {
            if (connection != null) {
                connection.rollback();
            }
            throw new SQLException(e.getMessage());
        } finally {
            // Fechar os recursos
            if (insertStatement != null) {
                insertStatement.close();
            }
            if (updateStatement != null) {
                updateStatement.close();
            }
            if (checkClienteStatement != null) {
                checkClienteStatement.close();
            }
            if (checkProdutoStatement != null) {
                checkProdutoStatement.close();
            }
            if (connection != null) {
                connection.setAutoCommit(true);
                connection.close();
            }
        }
    }

    public List<Vendas> visualizarVendas() {
        List<Vendas> vendas = new ArrayList<>();
        // Alterar a consulta SQL para ordenar por data_venda em ordem decrescente e limitar a 30 resultados
        String sql = "SELECT * FROM Vendas ORDER BY data_venda DESC LIMIT 30";
        try (Connection connection = JDBCConnection.getConnection(); Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                Vendas venda = new Vendas();
                venda.setId(resultSet.getInt("id"));
                venda.setProdutoId(resultSet.getInt("produto_id"));
                venda.setProdutoNome(resultSet.getString("nome_produto"));
                venda.setQuantidadeVendida(resultSet.getInt("quantidade_vendida"));
                venda.setValorUnit(resultSet.getDouble("valor_unitario"));
                venda.setValorTotal(resultSet.getDouble("valor_total"));
                venda.setClienteCpf(resultSet.getString("cliente_cpf"));
                venda.setDataVenda(resultSet.getTimestamp("data_venda"));
                vendas.add(venda);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return vendas;
    }

    public List<Vendas> visualizarVendasPorClienteCpf(String prefixoCpf) {
        List<Vendas> vendas = new ArrayList<>();
        // Alterar a consulta SQL para ordenar por data_venda em ordem decrescente e limitar a 30 resultados
        String sql = "SELECT * FROM Vendas WHERE LOWER(cliente_cpf) LIKE LOWER(?) ORDER BY data_venda DESC LIMIT 30"; // Usando LOWER para tornar a pesquisa case insensitive
        try (Connection connection = JDBCConnection.getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, prefixoCpf.toLowerCase() + "%"); // Convertendo o prefixo para minúsculas antes de passar para a consulta
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Vendas venda = new Vendas();
                    venda.setId(resultSet.getInt("id"));
                    venda.setProdutoId(resultSet.getInt("produto_id"));
                    venda.setProdutoNome(resultSet.getString("nome_produto"));
                    venda.setQuantidadeVendida(resultSet.getInt("quantidade_vendida"));
                    venda.setValorUnit(resultSet.getDouble("valor_unitario"));
                    venda.setValorTotal(resultSet.getDouble("valor_total"));
                    venda.setClienteCpf(resultSet.getString("cliente_cpf"));
                    venda.setDataVenda(resultSet.getTimestamp("data_venda"));
                    vendas.add(venda);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return vendas;
    }

}
