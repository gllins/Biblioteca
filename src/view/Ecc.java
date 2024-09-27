package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Ecc extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ecc frame = new Ecc();
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
	public Ecc() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\USER\\Downloads\\61f45ccfaeacba10aec9faab6775992a.png"));
		setTitle("Corte das Corujas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl = new JLabel("Batman: A Corte das Corujas");
		lbl.setForeground(new Color(0, 128, 255));
		lbl.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lbl.setBounds(68, 0, 300, 43);
		contentPane.add(lbl);
		
		JLabel lblNewLabel = new JLabel("Você selecionou o livro \"Corte das corujas\",");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(0, 37, 264, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(" a retirada deve ser realizada em uma de nossas unidades,");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(0, 80, 377, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(" tens até 30 dias para a devolução após a retirada");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(0, 105, 317, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Caso entregue com atraso ou avaria, será cobrada uma multa");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(0, 129, 442, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Boa leitura!");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_4.setForeground(new Color(0, 128, 255));
		lblNewLabel_4.setBounds(135, 181, 182, 55);
		contentPane.add(lblNewLabel_4);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 EmprestimoCC emprestimoCC = new EmprestimoCC();
					emprestimoCC.setVisible(true);
			         Ecc.this.dispose();
			}
		});
		btnVoltar.setBounds(309, 227, 89, 23);
		contentPane.add(btnVoltar);
	}

}
