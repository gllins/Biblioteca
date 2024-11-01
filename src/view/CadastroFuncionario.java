package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import dao.FuncionarioDao;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JRadioButton;
import model.Funcionario;

public class CadastroFuncionario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textTnome;
	private JTextField textTidade;
	private JTextField textTcpfc;
	private JTextField textTemailC;
	private JTextField textTtelefoneC;
	private JTextField textTenderecoC;
	private JTextField textDepartamento;
	private JTextField textTurno;
	private JTextField textCargo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroFuncionario frame = new CadastroFuncionario();
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
	public CadastroFuncionario() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\USER\\Downloads\\61f45ccfaeacba10aec9faab6775992a.png"));
		setTitle("Biblioteca");
		setForeground(new Color(0, 128, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroC = new JLabel("Cadastro Funcionário");
		lblCadastroC.setForeground(new Color(0, 128, 255));
		lblCadastroC.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblCadastroC.setBounds(132, 0, 182, 30);
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
		lblidadeC.setBounds(274, 25, 46, 14);
		contentPane.add(lblidadeC);
		
		textTidade = new JTextField();
		textTidade.setBounds(276, 50, 34, 20);
		contentPane.add(textTidade);
		textTidade.setColumns(10);
		
		JLabel lblSexoC = new JLabel("Sexo");
		lblSexoC.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblSexoC.setBounds(325, 25, 46, 14);
		contentPane.add(lblSexoC);
		
		JLabel lblCPFc = new JLabel("CPF");
		lblCPFc.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblCPFc.setBounds(35, 81, 46, 14);
		contentPane.add(lblCPFc);
		
		textTcpfc = new JTextField();
		textTcpfc.setBounds(35, 105, 167, 20);
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
		lblTelefoneC.setBounds(158, 186, 58, 14);
		contentPane.add(lblTelefoneC);
		
		textTtelefoneC = new JTextField();
		textTtelefoneC.setBounds(158, 211, 122, 20);
		contentPane.add(textTtelefoneC);
		textTtelefoneC.setColumns(10);
		
		JLabel lblEnderecoC = new JLabel("Endereço");
		lblEnderecoC.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblEnderecoC.setBounds(35, 186, 77, 14);
		contentPane.add(lblEnderecoC);
		
		textTenderecoC = new JTextField();
		textTenderecoC.setBounds(35, 211, 113, 20);
		contentPane.add(textTenderecoC);
		textTenderecoC.setColumns(10);
		
		JButton btnLimparC = new JButton("Limpar");
		btnLimparC.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		  
		        JTextField[] textFields = {textTnome, textTcpfc, textTidade, textTemailC, textTtelefoneC, textTenderecoC };
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
			        
			         CadastroFuncionario.this.dispose();
			}
		});
		btnCancelarC.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnCancelarC.setBounds(219, 242, 80, 20);
		contentPane.add(btnCancelarC);
		
		
		
		JButton btnCadastrarC = new JButton("Cadastrar");
		btnCadastrarC.setBounds(311, 241, 113, 23);
		contentPane.add(btnCadastrarC);
		
		JList<Object> list = new JList<Object>();
		list.setToolTipText("Masculino");
		list.setBounds(346, 52, 1, 1);
		contentPane.add(list);
		
		JList<Object> list_1 = new JList<Object>();
		list_1.setToolTipText("Feminino\r\n");
		list_1.setBounds(346, 52, 1, 1);
		contentPane.add(list_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Feminino");
		rdbtnNewRadioButton.setBounds(315, 49, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Masculino");
		rdbtnNewRadioButton_1.setBounds(315, 78, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
	
        ButtonGroup grupoRadios = new ButtonGroup();
        grupoRadios.add(rdbtnNewRadioButton_1);
        grupoRadios.add(rdbtnNewRadioButton);
        
        textDepartamento = new JTextField();
        textDepartamento.setBounds(212, 161, 135, 20);
        contentPane.add(textDepartamento);
        textDepartamento.setColumns(10);
        
        textTurno = new JTextField();
        textTurno.setBounds(212, 105, 142, 20);
        contentPane.add(textTurno);
        textTurno.setColumns(10);
        
        textCargo = new JTextField();
        textCargo.setBounds(290, 211, 134, 20);
        contentPane.add(textCargo);
        textCargo.setColumns(10);
        
        JLabel lblNewLabel = new JLabel("Turno");
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblNewLabel.setBounds(212, 81, 46, 14);
        contentPane.add(lblNewLabel);
        
        JLabel lblDepartamento = new JLabel("Departamento");
        lblDepartamento.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblDepartamento.setBounds(212, 137, 102, 14);
        contentPane.add(lblDepartamento);
        
        JLabel lblCargo = new JLabel("Cargo");
        lblCargo.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblCargo.setBounds(290, 186, 102, 14);
        contentPane.add(lblCargo);
     
        btnCadastrarC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                int idadeInt;
                try {
                    idadeInt = Integer.parseInt(textTidade.getText());
                    
                    
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Erro: Idade deve ser um número.");
                    return;
                }
           
                
		        boolean camposValidos = true;

		     
		        if (textTnome.getText().isEmpty() || textTidade.getText().isEmpty() || textTcpfc.getText().isEmpty() || textTemailC.getText().isEmpty() || textTtelefoneC.getText().isEmpty() || textTenderecoC.getText().isEmpty() || textTurno.getText().isEmpty() || textCargo.getText().isEmpty() || textDepartamento.getText().isEmpty()) {
		            camposValidos = false;
		        } 
		        String cpfRegex = "^\\d{11}$"; 
		        Pattern cpfPattern = Pattern.compile(cpfRegex);
		        Matcher cpfMatcher = cpfPattern.matcher(textTcpfc.getText());

		        if (!cpfMatcher.matches()) {
		            camposValidos = false;
		            JOptionPane.showMessageDialog(null, "Erro: CPF inválido.");
		        }
		      

		        String emailRegex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" 
		                           + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		        Pattern emailPattern = Pattern.compile(emailRegex);
		        Matcher emailMatcher = emailPattern.matcher(textTemailC.getText());

		        if (!emailMatcher.matches()) {
		            camposValidos = false;
		            JOptionPane.showMessageDialog(null, "Erro: E-mail inválido.");
		        }

		        if (!camposValidos) {
		            JOptionPane.showMessageDialog(null, "Erro: Preencha todos os campos corretamente.");
		            return;
		        }

		        if (camposValidos) {
		            CadastroFuncionario.this.dispose();

		            Gerenciamento Gerenciamento = new Gerenciamento();
		            Gerenciamento.setVisible(true);
		        }
		        
		       
		        /**************************************************************/
		        Funcionario f  = new Funcionario();
            	
            	f.setNome(textTnome.getText());
            	f.setIdade(Integer.parseInt(textTidade.getText()));
                f.setCpf(textTcpfc.getText());
                f.setEmail(textTemailC.getText());
                f.setTelefone(textTtelefoneC.getText());
                f.setEndereco(textTenderecoC.getText());
                f.setTurno(textTurno.getText());
                f.setDepartamento(textDepartamento.getText());
                f.setCargo(textCargo.getText());
                String sexo = rdbtnNewRadioButton.isSelected() ? "Feminino" : "Masculino";
                f.setSexo(sexo);
                
                FuncionarioDao fd = new FuncionarioDao();
                
               fd.save(f);
               /**************************************************************/
		        
		        
		        System.out.println("Dados cadastrados:");
		        System.out.println("Nome: " + f.getNome());
		        System.out.println("Idade: " + idadeInt);
		        System.out.println("CPF: " + f.getCpf());
		        System.out.println("E-mail: " + f.getEmail());
		        System.out.println("Telefone: " + f.getTelefone());
		        System.out.println("Endereço: " + f.getEndereco());
		        System.out.println("Turno: " + f.getTurno());
		        System.out.println("Departamento: " + f.getDepartamento());
		        System.out.println("Cargo: " + f.getCargo());
		        
		        

		    }
		});
	
        		Gerenciamento gerenciamento = new Gerenciamento();
		        gerenciamento.setVisible(true);
		        CadastroFuncionario.this.dispose();
	}	
}