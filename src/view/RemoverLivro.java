package view;
import java.awt.EventQueue;
import java.awt.Font; 
import java.awt.Toolkit; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton; 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField; 
import javax.swing.border.EmptyBorder;
import livro.Biblioteca; 
import livro.Livro;

public class RemoverLivro extends JFrame { private ArrayList<Livro> livros;


private static final long serialVersionUID = 1L;

protected static final int paginas = 0;

protected static final String titulo = null;

protected static final String idioma = null;

protected static final String avaliacao = null;

protected static final double ano = 0;

protected static final int editora = 0;

protected static final String autor = null;
private JPanel contentPane;
private JTextField JTextTitulo;
private JTextField jtextAutor;
 private Biblioteca biblioteca;

JTextArea areaDeListaDeLivros = new JTextArea();

    public RemoverLivro(Biblioteca biblioteca) {
        this.setBiblioteca(biblioteca);
    }
/**
 * Launch the application.
 */
public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				RemoverLivro frame = new RemoverLivro();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
}

/**
 * Create the frame.
 */
public RemoverLivro() {
	setTitle("Remover Livro");
	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\USER\\Downloads\\61f45ccfaeacba10aec9faab6775992a.png"));
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 450, 300);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

	setContentPane(contentPane);
	contentPane.setLayout(null);
	
	JLabel lblNewLabel = new JLabel("Digite o título do livro e o autor");
	lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
	lblNewLabel.setBounds(114, 11, 186, 14);
	contentPane.add(lblNewLabel);
	
	JTextTitulo = new JTextField();
	JTextTitulo.setBounds(66, 67, 176, 20);
	contentPane.add(JTextTitulo);
	JTextTitulo.setColumns(10);
	
	jtextAutor = new JTextField();
	jtextAutor.setBounds(66, 116, 176, 20);
	contentPane.add(jtextAutor);
	jtextAutor.setColumns(10);
	
	JLabel lblTtulo = new JLabel("Título\r\n:");
	lblTtulo.setFont(new Font("Times New Roman", Font.PLAIN, 15));
	lblTtulo.setBounds(10, 69, 38, 14);
	contentPane.add(lblTtulo);
	
	JLabel lblAutor = new JLabel("Autor\r\n:");
	lblAutor.setFont(new Font("Times New Roman", Font.PLAIN, 15));
	lblAutor.setBounds(10, 118, 38, 14);
	contentPane.add(lblAutor);
	
	
	JButton btnRemoveL = new JButton("Remover Livro");
	btnRemoveL.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	        // Get the title and author from the text fields
	        String title = JTextTitulo.getText();
	        String author = jtextAutor.getText();

	        Livro livro = new Livro(titulo, autor, paginas, idioma, editora, ano, avaliacao);
            biblioteca.removerLivro(livro);
	        // Find the book in the list
	        for (Livro livro1 : livros) {
	            if (livro1.getTitulo().equals(title) && livro1.getAutor().equals(author)) {
	                // Remove the book from the list
	                livros.remove(livro1);
	                break;
	            }
	        }

	        // Update the text area to show the updated list of books
	        areaDeListaDeLivros.setText(""); // clear the text area
	        for (Livro livro1 : livros) {
	            areaDeListaDeLivros.append(livro1.getTitulo() + " - " + livro1.getAutor() + "\n");
	        }
	    }
	});
	btnRemoveL.setBounds(305, 211, 126, 23);
	contentPane.add(btnRemoveL);
	

	JButton btnVoltar = new JButton("Voltar");
	btnVoltar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			TelaInicial telaInicial = new TelaInicial();
	        
	        
	        telaInicial.setVisible(true);
	        
	         RemoverLivro.this.dispose();
		}
	});
	btnVoltar.setBounds(206, 211, 89, 23);
	contentPane.add(btnVoltar);
}

public ArrayList<Livro> getLivros() {
	return livros;
}

public void setLivros(ArrayList<Livro> livros) {
	this.livros = livros;
}
public Biblioteca getBiblioteca() {
	return biblioteca;
}
public void setBiblioteca(Biblioteca biblioteca) {
	this.biblioteca = biblioteca;
}}