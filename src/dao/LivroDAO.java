package dao;

import java.sql.*;
import model.Livro;
import conexao.ConnectionFactory;

import java.util.ArrayList;
import java.util.List;

public class LivroDAO {

    public void save(Livro livro) {
        String sql = "INSERT INTO livro (titulo, autor, paginas, editora, ano, avaliacao, idioma) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.createConnectionToMySQL();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, livro.getTitulo());
            pstmt.setString(2, livro.getAutor());
            pstmt.setInt(3, livro.getPaginas());
            pstmt.setString(4, livro.getEditora());
            pstmt.setInt(5, livro.getAno());
            pstmt.setDouble(6, livro.getAvaliacao());
            pstmt.setString(7, livro.getIdioma());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public List<Livro> read() {
        List<Livro> livros = new ArrayList<>();
        String sql = "SELECT titulo, autor, paginas, editora, ano, avaliacao, idioma FROM livro";

        try (Connection conn = ConnectionFactory.createConnectionToMySQL();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Livro livro = new Livro();
                livro.setTitulo(rs.getString("titulo"));
                livro.setAutor(rs.getString("autor"));
                livro.setPaginas(rs.getInt("paginas"));
                livro.setEditora(rs.getString("editora"));
                livro.setAno(rs.getInt("ano"));
                livro.setAvaliacao(rs.getDouble("avaliacao"));
                livro.setIdioma(rs.getString("idioma"));
                livros.add(livro);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao carregar os livros: " + e.getMessage());
        }

        return livros;
    }
   
    public void update(Livro livro) {
        String sql = "UPDATE livro SET autor = ?, paginas = ?, editora = ?, ano = ?, avaliacao = ?, idioma = ? WHERE titulo = ?";

        try (Connection conn = ConnectionFactory.createConnectionToMySQL();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, livro.getAutor());
            pstmt.setInt(2, livro.getPaginas());
            pstmt.setString(3, livro.getEditora());
            pstmt.setInt(4, livro.getAno());
            pstmt.setDouble(5, livro.getAvaliacao());
            pstmt.setString(6, livro.getIdioma());
            pstmt.setString(7, livro.getTitulo());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(Livro livro) {
        String sql = "DELETE FROM livro WHERE titulo = ? ";

        try (Connection conn = ConnectionFactory.createConnectionToMySQL();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, livro.getTitulo());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

	public void inserirLivro(Livro livro) {
		// TODO Auto-generated method stub
		
	}

	public void remove(Livro l) {
		// TODO Auto-generated method stub
		
	}

	public void listarLivros() {
	}
}