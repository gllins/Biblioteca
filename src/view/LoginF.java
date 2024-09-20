package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginF extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textTNomeF;
	private JTextField textTIdadeF;
	private JTextField textTSexoF;
	private JTextField textTCargoF;
	private JTextField textTcpfF;
	private JTextField textTurnoF;
	private JTextField textTemail;
	private JTextField textTtelefoneF;
	private JTextField textTenderecoF;
	private JTextField textTdepartamentoF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginF frame = new LoginF();
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
	public LoginF() {
		setTitle("Biblioteca");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Giulia\\Downloads\\3296160.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroF = new JLabel("Cadastro Funcionário");
		lblCadastroF.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblCadastroF.setForeground(new Color(0, 128, 255));
		lblCadastroF.setBounds(130, 0, 177, 24);
		contentPane.add(lblCadastroF);
		
		JLabel lblNomeF = new JLabel("Nome");
		lblNomeF.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNomeF.setBounds(10, 29, 46, 14);
		contentPane.add(lblNomeF);
		
		textTNomeF = new JTextField();
		textTNomeF.setBounds(0, 55, 159, 24);
		contentPane.add(textTNomeF);
		textTNomeF.setColumns(10);
		
		JLabel lblidadeF = new JLabel("Idade");
		lblidadeF.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblidadeF.setBounds(170, 30, 46, 14);
		contentPane.add(lblidadeF);
		
		textTIdadeF = new JTextField();
		textTIdadeF.setBounds(169, 56, 46, 22);
		contentPane.add(textTIdadeF);
		textTIdadeF.setColumns(10);
		
		JLabel lblSexoF = new JLabel("Sexo");
		lblSexoF.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblSexoF.setBounds(226, 29, 46, 14);
		contentPane.add(lblSexoF);
		
		textTSexoF = new JTextField();
		textTSexoF.setBounds(225, 56, 46, 24);
		contentPane.add(textTSexoF);
		textTSexoF.setColumns(10);
		
		JLabel lblCargoF = new JLabel("Cargo");
		lblCargoF.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblCargoF.setBounds(290, 30, 46, 14);
		contentPane.add(lblCargoF);
		
		textTCargoF = new JTextField();
		textTCargoF.setBounds(281, 56, 143, 22);
		contentPane.add(textTCargoF);
		textTCargoF.setColumns(10);
		
		JLabel lblcpfF = new JLabel("CPF");
		lblcpfF.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblcpfF.setBounds(10, 89, 46, 14);
		contentPane.add(lblcpfF);
		
		textTcpfF = new JTextField();
		textTcpfF.setBounds(0, 114, 200, 24);
		contentPane.add(textTcpfF);
		textTcpfF.setColumns(10);
		
		JLabel lblTurnoF = new JLabel("Turno");
		lblTurnoF.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblTurnoF.setBounds(225, 90, 46, 14);
		contentPane.add(lblTurnoF);
		
		textTurnoF = new JTextField();
		textTurnoF.setBounds(221, 116, 143, 22);
		contentPane.add(textTurnoF);
		textTurnoF.setColumns(10);
		
		JLabel lblEmailF = new JLabel("E-mail");
		lblEmailF.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblEmailF.setBounds(10, 149, 46, 14);
		contentPane.add(lblEmailF);
		
		textTemail = new JTextField();
		textTemail.setBounds(0, 174, 200, 24);
		contentPane.add(textTemail);
		textTemail.setColumns(10);
		
		JLabel lblTelefoneF = new JLabel("Telefone");
		lblTelefoneF.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblTelefoneF.setBounds(207, 149, 60, 14);
		contentPane.add(lblTelefoneF);
		
		textTtelefoneF = new JTextField();
		textTtelefoneF.setBounds(210, 176, 214, 22);
		contentPane.add(textTtelefoneF);
		textTtelefoneF.setColumns(10);
		
		JButton btnCadastrarF = new JButton("Cadastrar");
		btnCadastrarF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCadastrarF.setBounds(325, 238, 109, 23);
		contentPane.add(btnCadastrarF);
		
		JButton btnCancelarF = new JButton("Cancelar");
		btnCancelarF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 TelaInicial telaInicial = new TelaInicial();
			        
			        
			        telaInicial.setVisible(true);
			        
			         LoginF.this.dispose();
			}
		});
		btnCancelarF.setBounds(226, 238, 89, 23);
		contentPane.add(btnCancelarF);
		
		JButton btnLimparF = new JButton("Limpar");
		btnLimparF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				        JTextField[] textFields = {textTNomeF, textTSexoF,  textTCargoF, textTcpfF, textTIdadeF,textTurnoF, textTemail, textTtelefoneF, textTenderecoF, textTdepartamentoF };
				        for (JTextField textField : textFields) {
				            textField.setText("");
				        }
				    }
				});
		btnLimparF.setBounds(130, 238, 89, 23);
		contentPane.add(btnLimparF);
		
		JLabel lblEnderecoF = new JLabel("Endereço");
		lblEnderecoF.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblEnderecoF.setBounds(0, 201, 66, 14);
		contentPane.add(lblEnderecoF);
		
		JLabel lblDepartamentoF = new JLabel("Departamento");
		lblDepartamentoF.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblDepartamentoF.setBounds(154, 201, 113, 14);
		contentPane.add(lblDepartamentoF);
		
		textTenderecoF = new JTextField();
		textTenderecoF.setBounds(0, 214, 137, 14);
		contentPane.add(textTenderecoF);
		textTenderecoF.setColumns(10);
		
		textTdepartamentoF = new JTextField();
		textTdepartamentoF.setBounds(147, 214, 124, 13);
		contentPane.add(textTdepartamentoF);
		textTdepartamentoF.setColumns(10);
	}
}