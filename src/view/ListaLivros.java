package view;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import dao.LivroDAO;
import model.Livro;

import java.util.ArrayList;
import java.util.List;

public class ListaLivros {
    public static void main(String[] args) {
     
        JFrame frame = new JFrame("Tabela");
        List<Livro> livros = new ArrayList<>();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);

       
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Título");
        modelo.addColumn("Autor");
        modelo.addColumn("Páginas");
        modelo.addColumn("Editora");
        modelo.addColumn("Ano");
        modelo.addColumn("Avaliação");
        modelo.addColumn("Idioma");
        modelo.addColumn("Imagem");
        
        LivroDAO ld = new LivroDAO();

        livros = ld.read();
//        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/usuario", "root", "");
//             Statement stmt = conn.createStatement();
//             ResultSet rs = stmt.executeQuery("SELECT titulo, autor, paginas, editora, ano, avaliacao, idioma FROM livro")) {

           
                modelo.addRow(new Object[]{
                        livros.get(0).getTitulo() ,
                        livros.get(0).getAutor() ,
                        livros.get(0).getPaginas() ,
                        livros.get(0).getEditora() ,
                        livros.get(0).getAno() ,
                        livros.get(0).getAvaliacao() ,
                        livros.get(0).getIdioma() ,
                        livros.get(0).getImagem() ,
                });
            

//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Erro ao carregar os dados: " + e.getMessage());
//        }
        frame.getContentPane().setLayout(null);

        JTable tabela = new JTable(modelo);

   
        JScrollPane scrollPane = new JScrollPane(tabela);
        scrollPane.setBounds(0, 0, 784, 402);
        frame.getContentPane().add(scrollPane);

    
        frame.setVisible(true);
    }

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}