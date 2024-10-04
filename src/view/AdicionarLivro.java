package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import livro.Biblioteca;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class AdicionarLivro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textTitulo;
	private JTextField textAutor;
	private JTextField textDtLancamento;
	private JTextField textEditora;
	private JTextField textAvaliacao;
	private JTextField textNumPaginas;
	private JTextField textIdioma;
	
	  private Biblioteca biblioteca;

	    public AdicionarLivro(Biblioteca biblioteca) {
	        this.setBiblioteca(biblioteca);
	    }
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdicionarLivro frame = new AdicionarLivro();
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
	public AdicionarLivro() {
		setTitle("Adicionar Livro");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\USER\\Downloads\\61f45ccfaeacba10aec9faab6775992a.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Adicionar Livro");
		lblNewLabel.setForeground(new Color(0, 128, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel.setBounds(135, 0, 165, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Título:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(0, 38, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textTitulo = new JTextField();
		textTitulo.setBounds(55, 35, 112, 20);
		contentPane.add(textTitulo);
		textTitulo.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Autor:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(182, 38, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textAutor = new JTextField();
		textAutor.setBounds(227, 35, 86, 20);
		contentPane.add(textAutor);
		textAutor.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Data de Lançamento:");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(0, 66, 103, 14);
		contentPane.add(lblNewLabel_3);
		
		textDtLancamento = new JTextField();
		textDtLancamento.setBounds(113, 63, 86, 20);
		contentPane.add(textDtLancamento);
		textDtLancamento.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Editora:");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_4.setBounds(209, 66, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		textEditora = new JTextField();
		textEditora.setBounds(262, 63, 86, 20);
		contentPane.add(textEditora);
		textEditora.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Avaliação:");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_5.setBounds(0, 92, 60, 14);
		contentPane.add(lblNewLabel_5);
		
		textAvaliacao = new JTextField();
		textAvaliacao.setBounds(55, 91, 86, 20);
		contentPane.add(textAvaliacao);
		textAvaliacao.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Número de páginas:");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_6.setBounds(153, 94, 90, 14);
		contentPane.add(lblNewLabel_6);
		
		textNumPaginas = new JTextField();
		textNumPaginas.setBounds(251, 89, 86, 20);
		contentPane.add(textNumPaginas);
		textNumPaginas.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Idioma:");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_7.setBounds(0, 119, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		textIdioma = new JTextField();
		textIdioma.setBounds(55, 117, 86, 20);
		contentPane.add(textIdioma);
		textIdioma.setColumns(10);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			      String titulo = textTitulo.getText();
			        String autor = textAutor.getText();
			        String paginas = textNumPaginas.getText();
			        String  idioma = textIdioma.getText();
			        String editora = textEditora.getText();
			        String ano = textDtLancamento.getText();
			        String avaliacao = textAvaliacao.getText();

			        boolean camposValidos = true;

			     
			        if (titulo.isEmpty() || autor.isEmpty() || paginas.isEmpty() || idioma.isEmpty() || editora.isEmpty() || ano.isEmpty() || avaliacao.isEmpty()) {
			            camposValidos = false;
			        }
			        if (!camposValidos) {
			            JOptionPane.showMessageDialog(null, "Erro: Preencha todos os campos corretamente.");
			            return;
			        }
			        System.out.println("Livro:");
			        System.out.println("Título: " + titulo);
			        System.out.println("Autor: " + autor);
			        System.out.println("Páginas: " + paginas);
			        System.out.println("Editora: " + editora);
			        System.out.println("Data de lançamento: " + ano);
			        System.out.println("Avaliação: " + avaliacao);
			        System.out.println("Idioma: " + idioma);
			}
		});
		btnAdicionar.setBounds(163, 115, 89, 23);
		contentPane.add(btnAdicionar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicial telaInicial = new TelaInicial();
		        
		        
		        telaInicial.setVisible(true);
		        
		         AdicionarLivro.this.dispose();
			}
		});
		btnVoltar.setBounds(259, 115, 89, 23);
		contentPane.add(btnVoltar);
	}

	public Biblioteca getBiblioteca() {
		return biblioteca;
	}
	public void setBiblioteca(Biblioteca biblioteca) {
		this.biblioteca = biblioteca;
	}

}