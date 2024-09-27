package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmprestimoPM extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmprestimoPM frame = new EmprestimoPM();
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
	public EmprestimoPM() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\USER\\Downloads\\61f45ccfaeacba10aec9faab6775992a.png"));
		setTitle("Biblioteca");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCapaPiadaM = new JLabel("");
		lblCapaPiadaM.setBounds(10, 11, 94, 173);
		lblCapaPiadaM.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\Design sem nome (5).png"));
		contentPane.add(lblCapaPiadaM);
		
		JLabel lblPiadaMt = new JLabel("Batman: A Piada Mortal");
		lblPiadaMt.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblPiadaMt.setForeground(new Color(0, 128, 255));
		lblPiadaMt.setBounds(138, 11, 249, 36);
		contentPane.add(lblPiadaMt);
		
		JLabel lblNewLabel = new JLabel("Número de páginas: 256");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(138, 86, 147, 18);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Autor: Greg Cox");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(138, 68, 217, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Idioma: Português");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(137, 105, 117, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Editora: Camelot");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(138, 125, 141, 18);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Ano: 31 jan 2023");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(138, 144, 127, 18);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Avaliação (0 a 5): 4,5");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(10, 188, 133, 18);
		contentPane.add(lblNewLabel_5);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 LivrosC livrosC = new LivrosC();
			        
			        
			        livrosC.setVisible(true);
			        
			        EmprestimoPM.this.dispose();
			}
		});
		btnVoltar.setBounds(309, 227, 89, 23);
		contentPane.add(btnVoltar);
		
		JButton btnEmprestimo = new JButton("Empréstimo");
		btnEmprestimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Epm loginScreen = new Epm();
			        
				 
			        loginScreen.setVisible(true);
			        EmprestimoPM.this.dispose();
			}
		});
		btnEmprestimo.setBounds(165, 227, 120, 23);
		contentPane.add(btnEmprestimo);
	}

}
