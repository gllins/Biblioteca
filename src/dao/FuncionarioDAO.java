package dao;

import java.sql.*;
import model.Funcionario;
import conexao.ConnectionFactory;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {

    public void save(Funcionario funcionario) {
        String sql = "INSERT INTO funcionario (nome, idade, sexo, cpf, email, telefone, endereco, turno, departamento, cargo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.createConnectionToMySQL();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, funcionario.getNome());
            pstmt.setInt(2, funcionario.getIdade());
            pstmt.setString(3, funcionario.getSexo());
            pstmt.setString(4, funcionario.getCpf());
            pstmt.setString(5, funcionario.getEmail());
            pstmt.setString(6, funcionario.getTelefone());
            pstmt.setString(7, funcionario.getEndereco());
            pstmt.setString(8, funcionario.getTurno());
            pstmt.setString(9, funcionario.getDepartamento());
            pstmt.setString(10, funcionario.getCargo());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Funcionario> read() {
        List<Funcionario> funcionarios = new ArrayList<>();
        String sql = "SELECT * FROM funcionario";

        try (Connection conn = ConnectionFactory.createConnectionToMySQL();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setNome(rs.getString("nome"));
                funcionario.setIdade(rs.getInt("idade"));
                funcionario.setSexo(rs.getString("sexo"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setEmail(rs.getString("email"));
                funcionario.setTelefone(rs.getString("telefone"));
                funcionario.setEndereco(rs.getString("endereco"));
                funcionario.setTurno(rs.getString("turno"));
                funcionario.setDepartamento(rs.getString("departamento"));
                funcionario.setCargo(rs.getString("cargo"));
                funcionarios.add(funcionario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return funcionarios;
    }

    public void update(Funcionario funcionario) {
        String sql = "UPDATE funcionario SET idade = ?, sexo = ?, cpf = ?, email = ?, telefone = ?, departamento = ?, turno = ?, cargo = ?, endereco = ? WHERE nome = ?";

        try (Connection conn = ConnectionFactory.createConnectionToMySQL();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, funcionario.getIdade());
            pstmt.setString(2, funcionario.getSexo());
            pstmt.setString(3, funcionario.getCpf());
            pstmt.setString(4, funcionario.getEmail());
            pstmt.setString(5, funcionario.getTelefone());
            pstmt.setString(6, funcionario.getEndereco());
            pstmt.setString(7, funcionario.getNome());
            pstmt.setString(8, funcionario.getTurno());
            pstmt.setString(9, funcionario.getDepartamento());
            pstmt.setString(10, funcionario.getCargo());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(Funcionario funcionario) {
        String sql = "DELETE FROM funcionario WHERE nome = ?";

        try (Connection conn = ConnectionFactory.createConnectionToMySQL();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, funcionario.getNome());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

	public void inserirFuncionario(Funcionario funcionario) {
		// TODO Auto-generated method stub
		
	}

	
	}
