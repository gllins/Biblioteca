package view;

import javax.swing.*;

import emprestimo.Emprestimo;
import livro.Livro;
import pessoa.Pessoa;

import java.awt.*;
import java.awt.event.*;
import java.util.Date;

public class StatusEmprestimo extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Emprestimo emprestimo;

    public StatusEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
        criarTela();
    }

    public StatusEmprestimo() {
		// TODO Auto-generated constructor stub
	}

	private void criarTela() {
        getContentPane().setLayout(new BorderLayout());

        // Cabeçalho
        JPanel header = new JPanel();
        header.setLayout(new FlowLayout());
        header.add(new JLabel("Verificar Status do Empréstimo"));
        getContentPane().add(header, BorderLayout.NORTH);

        // Corpo
        JPanel body = new JPanel();
        body.setLayout(new BoxLayout(body, BoxLayout.Y_AXIS));

        // Informações do empréstimo
        JPanel infoEmprestimo = new JPanel();
        infoEmprestimo.setLayout(new GridLayout(0, 2));
        infoEmprestimo.add(new JLabel("Livro:"));
        infoEmprestimo.add(new JLabel(emprestimo.getL().toString()));
        infoEmprestimo.add(new JLabel("Funcionário:"));
        infoEmprestimo.add(new JLabel(emprestimo.getF().toString()));
        infoEmprestimo.add(new JLabel("Cliente:"));
        infoEmprestimo.add(new JLabel(emprestimo.getC().toString()));
        infoEmprestimo.add(new JLabel("Data de início:"));
        infoEmprestimo.add(new JLabel(emprestimo.getDataInic().toString()));
        infoEmprestimo.add(new JLabel("Data de devolução:"));
        infoEmprestimo.add(new JLabel(emprestimo.getDataDevol().toString()));
        infoEmprestimo.add(new JLabel("Período total:"));
        infoEmprestimo.add(new JLabel(emprestimo.getPeriodoTotal()));
        infoEmprestimo.add(new JLabel("Status do empréstimo:"));
        infoEmprestimo.add(new JLabel(emprestimo.getStatus_emprestimo()));
        infoEmprestimo.add(new JLabel("Taxa de multa:"));
        infoEmprestimo.add(new JLabel(String.valueOf(emprestimo.getTaxa_multa())));

        body.add(infoEmprestimo);

        // Rodapé
        JPanel footer = new JPanel();
        footer.setLayout(new FlowLayout());
    	JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicial telaInicial = new TelaInicial();
		        
		        
		        telaInicial.setVisible(true);
		        
		         StatusEmprestimo.this.dispose();
			}
		});
        footer.add(btnVoltar);

        getContentPane().add(body, BorderLayout.CENTER);
        getContentPane().add(footer, BorderLayout.SOUTH);

        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        Livro livro = new Livro(); 
        Pessoa funcionario = new Pessoa(); 
        Pessoa cliente = new Pessoa(); 
        Date dataInic = new Date(); 
        Date dataDevol = new Date(); 
        String periodoTotal = "15 dias"; 
        String statusEmprestimo = "Em andamento"; 
        float taxaMulta = 10.0f; 
        Emprestimo emprestimo = new Emprestimo(livro, funcionario, cliente, dataInic, dataDevol, periodoTotal, statusEmprestimo, taxaMulta);
        new StatusEmprestimo(emprestimo);
    }}