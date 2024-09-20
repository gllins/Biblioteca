package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginC extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textTnome;
	private JTextField textTidade;
	private JTextField textTsexo;
	private JTextField textTcpfc;
	private JTextField textTemailC;
	private JTextField textTtelefoneC;
	private JTextField textTenderecoC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginC frame = new LoginC();
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
	public LoginC() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Giulia\\Downloads\\3296160.png"));
		setTitle("Biblioteca");
		setForeground(new Color(0, 128, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroC = new JLabel("Cadastro Cliente");
		lblCadastroC.setForeground(new Color(0, 128, 255));
		lblCadastroC.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblCadastroC.setBounds(132, 0, 167, 30);
		contentPane.add(lblCadastroC);
		
		textTnome = new JTextField();
		textTnome.setBounds(35, 50, 231, 20);
		contentPane.add(textTnome);
		textTnome.setColumns(10);
		
		JLabel lblNomeC = new JLabel("Nome");
		lblNomeC.setForeground(new Color(0, 0, 0));
		lblNomeC.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNomeC.setBounds(35, 25, 46, 14);
		contentPane.add(lblNomeC);
		
		JLabel lblidadeC = new JLabel("Idade");
		lblidadeC.setForeground(new Color(0, 0, 0));
		lblidadeC.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblidadeC.setBounds(288, 80, 46, 14);
		contentPane.add(lblidadeC);
		
		textTidade = new JTextField();
		textTidade.setBounds(288, 105, 34, 20);
		contentPane.add(textTidade);
		textTidade.setColumns(10);
		
		JLabel lblSexoC = new JLabel("Sexo");
		lblSexoC.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblSexoC.setBounds(276, 25, 46, 14);
		contentPane.add(lblSexoC);
		
		textTsexo = new JTextField();
		textTsexo.setBounds(276, 50, 34, 20);
		contentPane.add(textTsexo);
		textTsexo.setColumns(10);
		
		JLabel lblCPFc = new JLabel("CPF");
		lblCPFc.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblCPFc.setBounds(35, 81, 46, 14);
		contentPane.add(lblCPFc);
		
		textTcpfc = new JTextField();
		textTcpfc.setBounds(35, 105, 231, 20);
		contentPane.add(textTcpfc);
		textTcpfc.setColumns(10);
		
		JLabel lblemailC = new JLabel("E-mail");
		lblemailC.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblemailC.setBounds(35, 136, 46, 14);
		contentPane.add(lblemailC);
		
		textTemailC = new JTextField();
		textTemailC.setBounds(35, 161, 167, 20);
		contentPane.add(textTemailC);
		textTemailC.setColumns(10);
		
		JLabel lblTelefoneC = new JLabel("Telefone");
		lblTelefoneC.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblTelefoneC.setBounds(228, 136, 58, 14);
		contentPane.add(lblTelefoneC);
		
		textTtelefoneC = new JTextField();
		textTtelefoneC.setBounds(228, 161, 134, 20);
		contentPane.add(textTtelefoneC);
		textTtelefoneC.setColumns(10);
		
		JLabel lblEnderecoC = new JLabel("Endereço");
		lblEnderecoC.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblEnderecoC.setBounds(35, 186, 77, 14);
		contentPane.add(lblEnderecoC);
		
		textTenderecoC = new JTextField();
		textTenderecoC.setBounds(35, 211, 128, 20);
		contentPane.add(textTenderecoC);
		textTenderecoC.setColumns(10);
		
		JButton btnLimparC = new JButton("Limpar");
		btnLimparC.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		  
		        JTextField[] textFields = {textTnome, textTsexo, textTcpfc, textTidade, textTemailC, textTtelefoneC, textTenderecoC };
		        for (JTextField textField : textFields) {
		            textField.setText("");
		        }
		    }
		});
		btnLimparC.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnLimparC.setBounds(132, 242, 77, 20);
		contentPane.add(btnLimparC);
		
		JButton btnCancelarC = new JButton("Cancelar");
		btnCancelarC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 TelaInicial telaInicial = new TelaInicial();
			        
			        
			        telaInicial.setVisible(true);
			        
			         LoginC.this.dispose();
			}
		});
		btnCancelarC.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnCancelarC.setBounds(219, 242, 80, 20);
		contentPane.add(btnCancelarC);
		
		
		
		JButton btnCadastrarC = new JButton("Cadastrar");
		btnCadastrarC.setBounds(311, 241, 113, 23);
		contentPane.add(btnCadastrarC);
		btnCadastrarC.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		     
		        String nome = textTnome.getText();
		        String idade = textTidade.getText();
		        String sexo = textTsexo.getText();
		        String cpf = textTcpfc.getText();
		        String email = textTemailC.getText();
		        String telefone = textTtelefoneC.getText();
		        String endereco = textTenderecoC.getText();
		     
		        System.out.println("Dados cadastrados:");
		        System.out.println("Nome: " + nome);
		        System.out.println("Idade: " + idade);
		        System.out.println("Sexo: " + sexo);
		        System.out.println("CPF: " + cpf);
		        System.out.println("E-mail: " + email);
		        System.out.println("Telefone: " + telefone);
		        System.out.println("Endereço: " + endereco);

		    
		        LivrosC livrosC = new LivrosC();
		        livrosC.setVisible(true);
		        LoginC.this.dispose();
		    }
		});
	}
	
}