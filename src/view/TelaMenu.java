package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.border.EmptyBorder;
import livro.Biblioteca;
import livro.Livro; 
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.awt.Toolkit;

public class TelaMenu extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textTitulo;
    private JTextField textAutor;
    private JTextField textDtLancamento;
    private JTextField textEditora;
    private JTextField textAvaliacao;
    private JTextField textNumPaginas;
    private JTextField textIdioma;
    private JTextArea areaDeListaDeLivros;
    private ArrayList<Livro> livros;
    private Biblioteca biblioteca;

    /**
     * Create the frame.
     */
    public TelaMenu() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\USER\\Downloads\\61f45ccfaeacba10aec9faab6775992a.png"));
        this.biblioteca = new Biblioteca(); // Inicializa a biblioteca
        this.livros = new ArrayList<>(); // Inicializa a lista de livros
        initialize();
    }

    private void initialize() {
        setTitle("Biblioteca");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 400);

        // Barra de menu
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menu = new JMenu("Opções");
        menuBar.add(menu);

        JMenuItem adicionarLivroMenuItem = new JMenuItem("Adicionar Livro");
        adicionarLivroMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarAdicionarLivro();
            }
        });
        menu.add(adicionarLivroMenuItem);

        JMenuItem removerLivroMenuItem = new JMenuItem("Remover Livro");
        removerLivroMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarRemoverLivro();
            }
        });
        menu.add(removerLivroMenuItem);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        // Adiciona os componentes da tela de adicionar/remover conforme necessário
        mostrarAdicionarLivro();
    }

    // Método para exibir a tela de adicionar livro
    private void mostrarAdicionarLivro() {
        contentPane.removeAll();
        contentPane.repaint();
        contentPane.setLayout(null);

        JLabel lblTitulo = new JLabel("Título:");
        lblTitulo.setBounds(10, 30, 100, 20);
        contentPane.add(lblTitulo);

        textTitulo = new JTextField();
        textTitulo.setBounds(120, 30, 150, 20);
        contentPane.add(textTitulo);
        textTitulo.setColumns(10);

        JLabel lblAutor = new JLabel("Autor:");
        lblAutor.setBounds(10, 60, 100, 20);
        contentPane.add(lblAutor);

        textAutor = new JTextField();
        textAutor.setBounds(120, 60, 150, 20);
        contentPane.add(textAutor);
        textAutor.setColumns(10);

        JLabel lblAno = new JLabel("Ano:");
        lblAno.setBounds(10, 90, 100, 20);
        contentPane.add(lblAno);

        textDtLancamento = new JTextField();
        textDtLancamento.setBounds(120, 90, 150, 20);
        contentPane.add(textDtLancamento);

        JLabel lblEditora = new JLabel("Editora:");
        lblEditora.setBounds(10, 120, 100, 20);
        contentPane.add(lblEditora);

        textEditora = new JTextField();
        textEditora.setBounds(120, 120, 150, 20);
        contentPane.add(textEditora);

        JLabel lblAvaliacao = new JLabel("Avaliação:");
        lblAvaliacao.setBounds(10, 150, 100, 20);
        contentPane.add(lblAvaliacao);

        textAvaliacao = new JTextField();
        textAvaliacao.setBounds(120, 150, 150, 20);
        contentPane.add(textAvaliacao);

        JLabel lblNumPaginas = new JLabel("Número de Páginas:");
        lblNumPaginas.setBounds(10, 180, 150, 20);
        contentPane.add(lblNumPaginas);

        textNumPaginas = new JTextField();
        textNumPaginas.setBounds(120, 180, 150, 20);
        contentPane.add(textNumPaginas);

        JLabel lblIdioma = new JLabel("Idioma:");
        lblIdioma.setBounds(10, 210, 100, 20);
        contentPane.add(lblIdioma);

        textIdioma = new JTextField();
        textIdioma.setBounds(120, 210, 150, 20);
        contentPane.add(textIdioma);

        JButton btnAdicionar = new JButton("Adicionar Livro");
        btnAdicionar.setBounds(120, 250, 150, 25);
        btnAdicionar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                adicionarLivro();
            }
        });
        contentPane.add(btnAdicionar);
        
        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		 TelaInicial telaInicial = new TelaInicial();
 		        
 		        
 		        telaInicial.setVisible(true);
 		        
 		         TelaMenu.this.dispose();
        	}
        });
        btnVoltar.setBounds(302, 251, 89, 23);
        contentPane.add(btnVoltar);
        contentPane.revalidate();
        contentPane.repaint();
    }

    // Método para adicionar um livro à biblioteca
    private void adicionarLivro() {
        String titulo = textTitulo.getText();
        String autor = textAutor.getText();
        String paginasStr = textNumPaginas.getText();
        String idioma = textIdioma.getText();
        String editora = textEditora.getText();
        String anoStr = textDtLancamento.getText();
        String avaliacaoStr = textAvaliacao.getText();

        try {
            int paginas = Integer.parseInt(paginasStr);
            int ano = Integer.parseInt(anoStr);
            double avaliacao = Double.parseDouble(avaliacaoStr);

            Livro livro = new Livro(titulo, autor, paginas, idioma, ano, avaliacao, editora);
            livros.add(livro);
            biblioteca.adicionarLivro(livro);
            JOptionPane.showMessageDialog(this, "Livro adicionado com sucesso!");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Erro: Verifique os campos numéricos.");
        }
    }

    // Método para exibir a tela de remover livro
    private void mostrarRemoverLivro() {
        contentPane.removeAll();
        contentPane.repaint();

        JLabel lblTitulo = new JLabel("Título:");
        lblTitulo.setBounds(10, 30, 100, 20);
        contentPane.add(lblTitulo);

        textTitulo = new JTextField();
        textTitulo.setBounds(120, 30, 150, 20);
        contentPane.add(textTitulo);

        JLabel lblAutor = new JLabel("Autor:");
        lblAutor.setBounds(10, 60, 100, 20);
        contentPane.add(lblAutor);

        textAutor = new JTextField();
        textAutor.setBounds(120, 60, 150, 20);
        contentPane.add(textAutor);

        JButton btnRemover = new JButton("Remover Livro");
        btnRemover.setBounds(120, 100, 150, 25);
        btnRemover.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                removerLivro();
            }
        });
        contentPane.add(btnRemover);
        contentPane.revalidate();
        contentPane.repaint();
    }

    // Método para remover um livro da biblioteca
    private void removerLivro() {
        String titulo = textTitulo.getText();
        String autor = textAutor.getText();

        Livro livroParaRemover = null;
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo) && livro.getAutor().equals(autor)) {
                livroParaRemover = livro;
                break;
            }
        }

        if (livroParaRemover != null) {
            livros.remove(livroParaRemover);
            biblioteca.removerLivro(livroParaRemover);
            JOptionPane.showMessageDialog(this, "Livro removido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Livro não encontrado.");
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TelaMenu frame = new TelaMenu();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

	public JTextArea getAreaDeListaDeLivros() {
		return areaDeListaDeLivros;
	}

	public void setAreaDeListaDeLivros(JTextArea areaDeListaDeLivros) {
		this.areaDeListaDeLivros = areaDeListaDeLivros;
	}
}
