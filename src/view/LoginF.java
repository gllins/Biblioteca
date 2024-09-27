package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;

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
		
		JButton btnCadastrarF = new JButton("Cadastrar");
		btnCadastrarF.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        String nome = textTNomeF.getText();
		        String idade = textTIdadeF.getText();
		        String cargo = textTCargoF.getText();
		        String email = textTemail.getText();
		        String cpf = textTcpfF.getText();
		        String turno = textTurnoF.getText();
		        String telefone = textTtelefoneF.getText();
		        String endereco = textTenderecoF.getText();
		        String departamento = textTdepartamentoF.getText();
		        
		        int idadeInt;
		        try {
		            idadeInt = Integer.parseInt(idade);
		        } catch (NumberFormatException ex) {
		            JOptionPane.showMessageDialog(null, "Erro: Idade deve ser um número.");
		            return;
		        }
		        boolean camposValidos = true;

		     
		        if (nome.isEmpty() || idade.isEmpty() || cargo.isEmpty() || email.isEmpty() || cpf.isEmpty() || endereco.isEmpty()|| departamento.isEmpty() || turno.isEmpty() || telefone.isEmpty() ) {
		            camposValidos = false;
		        }

		        String cpfRegex = "^\\d{11}$"; 
		        Pattern cpfPattern = Pattern.compile(cpfRegex);
		        Matcher cpfMatcher = cpfPattern.matcher(cpf);

		        if (!cpfMatcher.matches()) {
		            camposValidos = false;
		            JOptionPane.showMessageDialog(null, "Erro: CPF inválido.");
		        }
		      

		        String emailRegex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" 
		                           + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		        Pattern emailPattern = Pattern.compile(emailRegex);
		        Matcher emailMatcher = emailPattern.matcher(email);

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
		        System.out.println("Dados cadastrados:");
		        System.out.println("Nome: " + nome);
		        System.out.println("Idade: " + idadeInt);
		        System.out.println("CPF: " + cpf);
		        System.out.println("E-mail: " + email);
		        System.out.println("Telefone: " + telefone);
		        System.out.println("Turno: " + turno);
		        System.out.println("Departamento: " + departamento);
		        System.out.println("Cargo: " + cargo);
		        System.out.println("Endereço: " + endereco);

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
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setToolTipText("");
		comboBox.addItem("Masculino");
		comboBox.addItem("Feminino");
		comboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    String respostaSelecionada = (String) comboBox.getSelectedItem();
                    System.out.println("Resposta selecionada: " + respostaSelecionada);
                }
            }
        });
		comboBox.setBounds(225, 56, 111, 22);
		contentPane.add(comboBox);
		
		JList<Object> list = new JList<Object>();
		list.setToolTipText("Masculino");
		list.setBounds(236, 59, 1, 1);
		contentPane.add(list);
		
		JList<Object> list_1 = new JList<Object>();
		list_1.setToolTipText("Feminino");
		list_1.setBounds(270, 59, 1, 1);
		contentPane.add(list_1);
	}
}