package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TelaInicial extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
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
	public TelaInicial() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\USER\\Downloads\\61f45ccfaeacba10aec9faab6775992a.png"));
		setTitle("Biblioteca");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnFuncionario = new JButton("");
		btnFuncionario.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\cliente (1).png"));
		btnFuncionario.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	 LoginF loginScreen = new LoginF();
			        
				 
			        loginScreen.setVisible(true);
			        TelaInicial.this.dispose();
		    }
		});		btnFuncionario.setBounds(10, 106, 54, 58);
		contentPane.add(btnFuncionario);
		
		JButton btnLivros = new JButton("");
		btnLivros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 LivrosL loginScreen = new LivrosL();
			        
				 
			        loginScreen.setVisible(true);
			        TelaInicial.this.dispose();
			}
		});
		btnLivros.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\cliente (2).png"));
		btnLivros.setSelectedIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\Design sem nome (1).png"));
		btnLivros.setBounds(10, 175, 54, 58);
		contentPane.add(btnLivros);
		
		JButton btnCliente = new JButton("");
		btnCliente.addActionListener(new ActionListener() {
	
			public void actionPerformed(ActionEvent e) {

		        LoginC loginScreen = new LoginC();
		        
		 
		        loginScreen.setVisible(true);
		        TelaInicial.this.dispose();
			}
		});
		btnCliente.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\cliente.png"));
		btnCliente.setBounds(10, 37, 54, 58);
		contentPane.add(btnCliente);
		
		JLabel lblBemvindo = new JLabel("Bem Vindo!");
		lblBemvindo.setForeground(new Color(0, 128, 255));
		lblBemvindo.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblBemvindo.setBounds(165, 0, 155, 46);
		contentPane.add(lblBemvindo);
		
		JLabel lblimgbibli = new JLabel("");
		lblimgbibli.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\Design sem nome (3).png"));
		lblimgbibli.setBounds(139, 57, 219, 181);
		contentPane.add(lblimgbibli);
		
		JLabel lblNewLabel = new JLabel("Biblioteca Virtual");
		lblNewLabel.setForeground(new Color(0, 128, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel.setBounds(176, 228, 182, 46);
		contentPane.add(lblNewLabel);
	}
}
