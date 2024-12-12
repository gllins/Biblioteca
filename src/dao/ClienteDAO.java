package dao;

import java.sql.*;
import model.Cliente;
import conexao.ConnectionFactory;

import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    public void save(Cliente cliente) {
        String sql = "INSERT INTO cliente (nome, idade, sexo, cpf, email, telefone, endereco) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.createConnectionToMySQL();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, cliente.getNome());
            pstmt.setInt(2, cliente.getIdade());
            pstmt.setString(3, cliente.getSexo());
            pstmt.setString(4, cliente.getCpf());
            pstmt.setString(5, cliente.getEmail());
            pstmt.setString(6, cliente.getTelefone());
            pstmt.setString(7, cliente.getEndereco());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Cliente> read() {
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM cliente";

        try (Connection conn = ConnectionFactory.createConnectionToMySQL();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setNome(rs.getString("nome"));
                cliente.setIdade(rs.getInt("idade"));
                cliente.setSexo(rs.getString("sexo"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setEmail(rs.getString("email"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setEndereco(rs.getString("endereco"));
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clientes;
    }

    public void update(Cliente cliente) {
        String sql = "UPDATE cliente SET idade = ?, sexo = ?, cpf = ?, email = ?, telefone = ?, endereco = ? WHERE nome = ?";

        try (Connection conn = ConnectionFactory.createConnectionToMySQL();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, cliente.getIdade());
            pstmt.setString(2, cliente.getSexo());
            pstmt.setString(3, cliente.getCpf());
            pstmt.setString(4, cliente.getEmail());
            pstmt.setString(5, cliente.getTelefone());
            pstmt.setString(6, cliente.getEndereco());
            pstmt.setString(7, cliente.getNome());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(Cliente cliente) {
        String sql = "DELETE FROM cliente WHERE nome = ?";

        try (Connection conn = ConnectionFactory.createConnectionToMySQL();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, cliente.getNome());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

	public void inserirCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}


}