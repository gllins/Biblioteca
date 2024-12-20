package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.LivroDAO;
import model.Livro;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AtualizarLivro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField TituloField;
	private JTextField AutorField;
	private JTextField PaginasField;
	private JTextField EditoraField;
	private JTextField AnoField;
	private JTextField AvaliacaoField;
	private JTextField IdiomaField;
	private JButton btnVoltar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AtualizarLivro frame = new AtualizarLivro();
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
	public AtualizarLivro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Título");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 20, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Autor");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 45, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Páginas");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 70, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Editora");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 95, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Ano");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(10, 120, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Avaliação");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(10, 145, 66, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Idioma");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(10, 170, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		TituloField = new JTextField();
		TituloField.setBounds(66, 19, 211, 20);
		contentPane.add(TituloField);
		TituloField.setColumns(10);
		
		AutorField = new JTextField();
		AutorField.setBounds(66, 44, 211, 20);
		contentPane.add(AutorField);
		AutorField.setColumns(10);
		
		PaginasField = new JTextField();
		PaginasField.setBounds(64, 69, 213, 20);
		contentPane.add(PaginasField);
		PaginasField.setColumns(10);
		
		EditoraField = new JTextField();
		EditoraField.setBounds(66, 94, 211, 20);
		contentPane.add(EditoraField);
		EditoraField.setColumns(10);
		
		AnoField = new JTextField();
		AnoField.setBounds(68, 119, 211, 20);
		contentPane.add(AnoField);
		AnoField.setColumns(10);
		
		AvaliacaoField = new JTextField();
		AvaliacaoField.setBounds(78, 144, 199, 20);
		contentPane.add(AvaliacaoField);
		AvaliacaoField.setColumns(10);
		
		IdiomaField = new JTextField();
		IdiomaField.setBounds(66, 169, 211, 20);
		contentPane.add(IdiomaField);
		IdiomaField.setColumns(10);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  String titulo = TituloField.getText();
	                String autor = AutorField.getText();
	                int paginas = Integer.parseInt(PaginasField.getText());
	                String editora = EditoraField.getText();
	                int ano = Integer.parseInt(AnoField.getText());
	                double avaliacao = Double.parseDouble(AvaliacaoField.getText());
	                String idioma = IdiomaField.getText();

	                // Criar o livro com os dados atualizados
	                Livro livro = new Livro(titulo, autor, paginas, editora, ano, avaliacao, idioma);
	                LivroDAO livroDAO = new LivroDAO();
	                livroDAO.update(livro);
			}
		});
		btnAtualizar.setBounds(308, 227, 89, 23);
		contentPane.add(btnAtualizar);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Gerenciamento TelaInicial = new Gerenciamento();
			        
			        
			      TelaInicial.setVisible(true);
			        
			       AtualizarLivro.this.dispose();
			}
		});
		btnVoltar.setBounds(188, 227, 89, 23);
		contentPane.add(btnVoltar);
	}
}
