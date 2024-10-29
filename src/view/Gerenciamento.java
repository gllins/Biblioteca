package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Gerenciamento extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gerenciamento frame = new Gerenciamento();
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
	public Gerenciamento() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\USER\\Downloads\\61f45ccfaeacba10aec9faab6775992a.png"));
		setTitle("Gerenciamento");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Escolha uma ação");
		lblNewLabel.setForeground(new Color(0, 128, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel.setBounds(118, 11, 194, 30);
		contentPane.add(lblNewLabel);
		
		JButton btnAddL = new JButton("");
		btnAddL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 TelaMenu AddLivro = new TelaMenu();
			        
			        AddLivro.setVisible(true);
			        
			     Gerenciamento.this.dispose();
			}
		});
		btnAddL.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\cliente (4).png"));
		btnAddL.setBounds(21, 43, 54, 58);
		contentPane.add(btnAddL);
		
		JButton btnRemoveL = new JButton("");
		btnRemoveL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaMenu RemoveL = new TelaMenu();
			        
			        RemoveL.setVisible(true);
			        
			     Gerenciamento.this.dispose();
			}
			}
		);
		btnRemoveL.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\cliente (5).png"));
		btnRemoveL.setBounds(21, 118, 54, 58);
		contentPane.add(btnRemoveL);
		
		JButton btnStatusEmprestimo = new JButton("");
		btnStatusEmprestimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				   
				 StatusEmprestimo StatusEmprestimo = new  StatusEmprestimo();
                StatusEmprestimo.setVisible(true);
                Gerenciamento gerenciamento = new Gerenciamento();
				gerenciamento.setVisible(false);
            }
        });
		btnStatusEmprestimo.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\cliente (3).png"));
		btnStatusEmprestimo.setBounds(21, 192, 54, 58);
		contentPane.add(btnStatusEmprestimo);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\Biblioteca.png"));
		lblNewLabel_1.setBounds(118, 69, 219, 181);
		contentPane.add(lblNewLabel_1);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 TelaInicial TelaInicial = new TelaInicial();
			        
			        
			      TelaInicial.setVisible(true);
			        
			       Gerenciamento.this.dispose();
			}
		});
		btnVoltar.setBounds(345, 227, 89, 23);
		contentPane.add(btnVoltar);
	}
}