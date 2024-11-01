package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import dao.FuncionarioDao;
import model.Funcionario;

public class LoginF extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textTNomeF;
	private JTextField textTIdadeF;
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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\USER\\Downloads\\61f45ccfaeacba10aec9faab6775992a.png"));
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
		textTNomeF.setBounds(0, 54, 196, 24);
		contentPane.add(textTNomeF);
		textTNomeF.setColumns(10);
		
		JLabel lblidadeF = new JLabel("Idade");
		lblidadeF.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblidadeF.setBounds(214, 29, 46, 14);
		contentPane.add(lblidadeF);
		
		textTIdadeF = new JTextField();
		textTIdadeF.setBounds(214, 56, 46, 22);
		contentPane.add(textTIdadeF);
		textTIdadeF.setColumns(10);
		
		JLabel lblSexoF = new JLabel("Sexo");
		lblSexoF.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblSexoF.setBounds(275, 35, 46, 14);
		contentPane.add(lblSexoF);
		
		JLabel lblCargoF = new JLabel("Cargo");
		lblCargoF.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblCargoF.setBounds(290, 184, 46, 14);
		contentPane.add(lblCargoF);
		
		textTCargoF = new JTextField();
		textTCargoF.setBounds(290, 205, 143, 22);
		contentPane.add(textTCargoF);
		textTCargoF.setColumns(10);
		
		JLabel lblcpfF = new JLabel("CPF");
		lblcpfF.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblcpfF.setBounds(10, 89, 46, 14);
		contentPane.add(lblcpfF);
		
		textTcpfF = new JTextField();
		textTcpfF.setBounds(0, 103, 200, 24);
		contentPane.add(textTcpfF);
		textTcpfF.setColumns(10);
		
		JLabel lblTurnoF = new JLabel("Turno");
		lblTurnoF.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblTurnoF.setBounds(225, 90, 46, 14);
		contentPane.add(lblTurnoF);
		
		textTurnoF = new JTextField();
		textTurnoF.setBounds(220, 104, 143, 22);
		contentPane.add(textTurnoF);
		textTurnoF.setColumns(10);
		
		JLabel lblEmailF = new JLabel("E-mail");
		lblEmailF.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblEmailF.setBounds(10, 138, 46, 14);
		contentPane.add(lblEmailF);
		
		textTemail = new JTextField();
		textTemail.setBounds(0, 150, 200, 24);
		contentPane.add(textTemail);
		textTemail.setColumns(10);
		
		JLabel lblTelefoneF = new JLabel("Telefone");
		lblTelefoneF.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblTelefoneF.setBounds(210, 137, 60, 14);
		contentPane.add(lblTelefoneF);
		
		textTtelefoneF = new JTextField();
		textTtelefoneF.setBounds(210, 151, 214, 22);
		contentPane.add(textTtelefoneF);
		textTtelefoneF.setColumns(10);
		
		JList<Object> list = new JList<Object>();
		list.setToolTipText("Masculino");
		list.setBounds(346, 52, 1, 1);
		contentPane.add(list);
		
		JList<Object> list_1 = new JList<Object>();
		list_1.setToolTipText("Feminino\r\n");
		list_1.setBounds(346, 52, 1, 1);
		contentPane.add(list_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Feminino");
		rdbtnNewRadioButton.setBounds(275, 55, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Masculino");
		rdbtnNewRadioButton_1.setBounds(275, 76, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
	
        ButtonGroup grupoRadios = new ButtonGroup();
        grupoRadios.add(rdbtnNewRadioButton_1);
        grupoRadios.add(rdbtnNewRadioButton);
    
		
		JButton btnCadastrarF = new JButton("Cadastrar");
		btnCadastrarF.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				   int idadeInt;
			        try {
			            idadeInt = Integer.parseInt(textTIdadeF.getText());
			        } catch (NumberFormatException ex) {
			            JOptionPane.showMessageDialog(null, "Erro: Idade deve ser um número.");
			            return;
			        }
			        boolean camposValidos = true;

			     
			        if (textTNomeF.getText().isEmpty() ||textTIdadeF.getText().isEmpty() || textTCargoF.getText().isEmpty() || textTemail.getText().isEmpty() || textTcpfF.getText().isEmpty() || textTurnoF.getText().isEmpty()|| textTdepartamentoF.getText().isEmpty() || textTurnoF.getText().isEmpty() || textTtelefoneF.getText().isEmpty() ) {
			            camposValidos = false;
			        }

			        String cpfRegex = "^\\d{11}$"; 
			        Pattern cpfPattern = Pattern.compile(cpfRegex);
			        Matcher cpfMatcher = cpfPattern.matcher(textTcpfF.getText());

			        if (!cpfMatcher.matches()) {
			            camposValidos = false;
			            JOptionPane.showMessageDialog(null, "Erro: CPF inválido.");
			        }
			      

			        String emailRegex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" 
			                           + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
			        Pattern emailPattern = Pattern.compile(emailRegex);
			        Matcher emailMatcher = emailPattern.matcher(textTemail.getText());

			        if (!emailMatcher.matches()) {
			            camposValidos = false;
			            JOptionPane.showMessageDialog(null, "Erro: E-mail inválido.");
			        }

			        if (!camposValidos) {
			            JOptionPane.showMessageDialog(null, "Erro: Preencha todos os campos corretamente.");
			            return;
			        }

			        if (camposValidos) {
			            LoginF.this.dispose();

			            Gerenciamento Gerenciamento = new Gerenciamento();
			            Gerenciamento.setVisible(true);
			        }
			        /**************************************************************/
				       Funcionario  f  = new Funcionario();
		            	
		            	f.setNome(textTNomeF.getText());
		            	f.setIdade(Integer.parseInt(textTIdadeF.getText()));
		                f.setCpf(textTcpfF.getText());
		                f.setEmail(textTemail.getText());
		                f.setTelefone(textTtelefoneF.getText());
		                f.setEndereco(textTenderecoF.getText());
		                f.setTurno(textTurnoF.getText());
		                f.setDepartamento(textTdepartamentoF.getText());
		                f.setCargo(textTCargoF.getText());
		                String sexo = rdbtnNewRadioButton.isSelected() ? "Feminino" : "Masculino";
		                f.setSexo(sexo);
		                
		                FuncionarioDao fd = new FuncionarioDao();
		                
		               fd.save(f);
		               /**************************************************************/
		               System.out.println("Dados cadastrados:");
				        System.out.println("Nome: " + textTNomeF.getText());
				        System.out.println("Idade: " + idadeInt);
				        System.out.println("CPF: " + textTcpfF.getText());
				        System.out.println("E-mail: " + textTemail.getText());
				        System.out.println("Telefone: " + textTtelefoneF.getText());
				        System.out.println("Turno: " + textTurnoF.getText());
				        System.out.println("Departamento: " + textTdepartamentoF.getText());
				        System.out.println("Cargo: " + textTCargoF.getText());
				        System.out.println("Endereço: " + textTenderecoF.getText());

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
				        JTextField[] textFields = {textTNomeF, textTCargoF, textTcpfF, textTIdadeF,textTurnoF, textTemail, textTtelefoneF, textTenderecoF, textTdepartamentoF };
				        for (JTextField textField : textFields) {
				            textField.setText("");
				        }
				    }
				});
		btnLimparF.setBounds(130, 238, 89, 23);
		contentPane.add(btnLimparF);
		
		JLabel lblEnderecoF = new JLabel("Endereço");
		lblEnderecoF.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblEnderecoF.setBounds(10, 184, 66, 14);
		contentPane.add(lblEnderecoF);
		
		JLabel lblDepartamentoF = new JLabel("Departamento");
		lblDepartamentoF.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblDepartamentoF.setBounds(147, 184, 113, 14);
		contentPane.add(lblDepartamentoF);
		
		textTenderecoF = new JTextField();
		textTenderecoF.setBounds(0, 204, 137, 24);
		contentPane.add(textTenderecoF);
		textTenderecoF.setColumns(10);
		
		textTdepartamentoF = new JTextField();
		textTdepartamentoF.setBounds(147, 203, 124, 24);
		contentPane.add(textTdepartamentoF);
		textTdepartamentoF.setColumns(10);
	}
}

