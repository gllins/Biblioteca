package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import biblioteca.Biblioteca;

import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StatusEmprestimo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StatusEmprestimo frame = new StatusEmprestimo();
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
	public StatusEmprestimo() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\USER\\Downloads\\61f45ccfaeacba10aec9faab6775992a.png"));
		setTitle("Status Emprestimo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Verificar Status do empréstimo");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel.setBounds(97, 11, 273, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Livro: O últimos dias de Krypton");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 36, 197, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Funcionário: Thaís");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 61, 116, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Cliente: Antônio");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(10, 86, 116, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Data de início: 08/10/2024");
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2_2.setBounds(11, 110, 157, 14);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Data de devolução: 23/10/2024");
		lblNewLabel_2_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2_2_1.setBounds(10, 135, 197, 14);
		contentPane.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Status do empréstimo: Em  andamento");
		lblNewLabel_2_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2_2_2.setBounds(11, 160, 234, 14);
		contentPane.add(lblNewLabel_2_2_2);
		
		JLabel lblNewLabel_2_2_3 = new JLabel("Taxa de multa: 10.0");
		lblNewLabel_2_2_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2_2_3.setBounds(11, 185, 157, 14);
		contentPane.add(lblNewLabel_2_2_3);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 TelaInicial TelaInicial = new TelaInicial();
			        
			        
			      TelaInicial.setVisible(true);
			        
			       StatusEmprestimo.this.dispose();
			}
		});
		btnVoltar.setBounds(156, 227, 89, 23);
		contentPane.add(btnVoltar);
	}

	public StatusEmprestimo(Biblioteca emprestimo) {
		// TODO Auto-generated constructor stub
	}
}
