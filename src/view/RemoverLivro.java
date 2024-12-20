package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.LivroDAO;
import model.Livro;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RemoverLivro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField titulo;

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
		
		JLabel lblNewLabel = new JLabel("Remover Livro");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel.setBounds(105, 11, 138, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Título");
		lblNewLabel_1.setBounds(20, 97, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		titulo = new JTextField();
		titulo.setBounds(76, 94, 158, 20);
		contentPane.add(titulo);
		titulo.setColumns(10);
		
		JButton btnNewButton = new JButton("Remover");
		btnNewButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        /********/
		        Livro l  = new Livro();

		        l.setTitulo(titulo.getText());
		        // l.setAutor(autor.getText()); Se for necessário, adicione outros campos.

		        LivroDAO ld = new LivroDAO();
		        ld.delete(l.getTitulo()); // Passando apenas o título para o método delete.

		        /********/
		        System.out.println("Livro Removido:");
		        System.out.println("Título: " + l.getTitulo());
		        // System.out.println("Autor: " + l.getAutor()); Se necessário.
		        JOptionPane.showMessageDialog(null, "Livro removido com sucesso!");

		        titulo.setText(""); // Limpar campo de título após remoção.
		    }
		});
		
		   


		btnNewButton.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Gerenciamento gerenciamento = new Gerenciamento();
			        
			        
			        gerenciamento.setVisible(true);
			        
			         RemoverLivro.this.dispose();
			
			}
		});
		btnNewButton_1.setBounds(236, 227, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\Design sem nome (12).png"));
		lblNewLabel_8.setBounds(257, 52, 151, 161);
		contentPane.add(lblNewLabel_8);
	}
}
