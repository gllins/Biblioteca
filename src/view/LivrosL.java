package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LivrosL extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LivrosL frame = new LivrosL();
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
	public LivrosL() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\USER\\Downloads\\61f45ccfaeacba10aec9faab6775992a.png"));
		setTitle("Biblioteca");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblaviso = new JLabel("Mais livros em breve!");
		lblaviso.setForeground(new Color(0, 128, 255));
		lblaviso.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblaviso.setBounds(10, 194, 182, 24);
		contentPane.add(lblaviso);
		
		JButton btnPiadaM = new JButton("");
		btnPiadaM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 PiadaM loginScreen = new PiadaM();
			        
				 
			        loginScreen.setVisible(true);
			        LivrosL.this.dispose();
			}
		});
		btnPiadaM.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\Design sem nome (8).png"));
		btnPiadaM.setBounds(10, 11, 63, 103);
		contentPane.add(btnPiadaM);
		
		JButton btnAmorI = new JButton("");
		btnAmorI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 AmorI loginScreen = new AmorI();
			        
				 
			        loginScreen.setVisible(true);
			        LivrosL.this.dispose();
			}
		});
		btnAmorI.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\Design sem nome (9).png"));
		btnAmorI.setBackground(new Color(240, 240, 240));
		btnAmorI.setBounds(83, 11, 63, 103);
		contentPane.add(btnAmorI);
		
		JButton btnCorteC = new JButton("");
		btnCorteC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 CorteC loginScreen = new CorteC();
			        
				 
			        loginScreen.setVisible(true);
			        LivrosL.this.dispose();
			}
		});
		btnCorteC.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\Design sem nome (10).png"));
		btnCorteC.setBounds(156, 11, 63, 103);
		contentPane.add(btnCorteC);
		
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		 
		        TelaInicial telaInicial = new TelaInicial();
		        
		        
		        telaInicial.setVisible(true);
		        
		         LivrosL.this.dispose();
		    }
		});
		btnVoltar.setBounds(268, 227, 89, 23);
		contentPane.add(btnVoltar);
	}
}
