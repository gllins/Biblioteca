package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import emprestimo.Emprestimo;
import livro.Livro;
import pessoa.Pessoa;

public class SEmprestimo extends JFrame {

    private static final long serialVersionUID = 1L;
    private Emprestimo emprestimo;

    public SEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
        criarTela();
    }

    private void criarTela() {
        getContentPane().setLayout(new BorderLayout());

        // Header
        JPanel header = new JPanel();
        header.setLayout(new FlowLayout());
        header.add(new JLabel("Verificar Status do Empréstimo"));
        getContentPane().add(header, BorderLayout.NORTH);

        // Body
        JPanel body = new JPanel();
        body.setLayout(new BoxLayout(body, BoxLayout.Y_AXIS));

        JPanel infoEmprestimo = new JPanel();
        infoEmprestimo.setLayout(new GridLayout(0, 2));

        // Exibir informações
        infoEmprestimo.add(new JLabel("Livro:"));
        infoEmprestimo.add(new JLabel(emprestimo.getL().getTitulo())); 
        
        infoEmprestimo.add(new JLabel("Funcionário:"));
        infoEmprestimo.add(new JLabel(emprestimo.getF().getNome())); 

        infoEmprestimo.add(new JLabel("Cliente:"));
        infoEmprestimo.add(new JLabel(emprestimo.getC().getNome())); 

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Datas
        LocalDate dataInicio = emprestimo.getDataInicio();
        infoEmprestimo.add(new JLabel("Data de início:"));
        infoEmprestimo.add(new JLabel(dataInicio.format(formatter))); 

        LocalDate dataDevolucao = emprestimo.getDataDevolucao();
        infoEmprestimo.add(new JLabel("Data de devolução:"));
        infoEmprestimo.add(new JLabel(dataDevolucao.format(formatter))); 

        // Período, status e multa
        infoEmprestimo.add(new JLabel("Período total:"));
        infoEmprestimo.add(new JLabel(emprestimo.getPeriodoTotal()));

        infoEmprestimo.add(new JLabel("Status do empréstimo:"));
        infoEmprestimo.add(new JLabel(emprestimo.getStatus_emprestimo()));

        infoEmprestimo.add(new JLabel("Taxa de multa:"));
        infoEmprestimo.add(new JLabel(String.valueOf(emprestimo.getTaxa_multa())));

        body.add(infoEmprestimo);

        // Footer
        JPanel footer = new JPanel();
        footer.setLayout(new FlowLayout());
        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaInicial telaInicial = new TelaInicial();
                telaInicial.setVisible(true);
                SEmprestimo.this.dispose();
            }
        });
        footer.add(btnVoltar);

        getContentPane().add(body, BorderLayout.CENTER);
        getContentPane().add(footer, BorderLayout.SOUTH);

        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela
        setVisible(true);
    }

    public static void main(String[] args) {
        // Inicialização para testes
        Livro livro = new Livro();
        livro.setTitulo("Os Últimos Dias de Krypton"); 

        Pessoa funcionario = new Pessoa();
        funcionario.setNome("Thaís"); 

        Pessoa cliente = new Pessoa();
        cliente.setNome("Giulia"); 

        String periodoTotal = "15 dias";
        String statusEmprestimo = "Em andamento";
        float taxaMulta = 10.0f;

        Emprestimo emprestimo = new Emprestimo(livro, funcionario, cliente, 
                LocalDate.now().minusDays(14), LocalDate.now().plusDays(1), 
                periodoTotal, statusEmprestimo, taxaMulta);

        new StatusEmprestimo(emprestimo);
    }
}