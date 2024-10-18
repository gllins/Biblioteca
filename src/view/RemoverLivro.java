package view;

import java.awt.EventQueue;
import java.awt.Font; 
import java.awt.Toolkit; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton; 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane; // Para exibir mensagens
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField; 
import javax.swing.border.EmptyBorder;

import livro.Biblioteca; 
import livro.Livro;

public class RemoverLivro extends JFrame {
    private ArrayList<Livro> livros;
    private Biblioteca biblioteca;

    private static final long serialVersionUID = 1L;

    private JPanel contentPane;
    private JTextField JTextTitulo;
    private JTextField jtextAutor;
    JTextArea areaDeListaDeLivros = new JTextArea();

    public RemoverLivro(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
        this.livros = new ArrayList<>(); // Inicializa a lista de livros
        initialize();
    }

    public RemoverLivro() {
        // Construtor padrão não deve ser usado, mas está aqui para compatibilidade
        this(new Biblioteca()); // Chama o construtor que aceita Biblioteca
    }

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Biblioteca biblioteca = new Biblioteca(); // Crie uma instância da Biblioteca
                    RemoverLivro frame = new RemoverLivro(biblioteca); // Passe a biblioteca para o construtor
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        setTitle("Remover Livro");
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\USER\\Downloads\\61f45ccfaeacba10aec9faab6775992a.png"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Digite o título do livro e o autor");
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblNewLabel.setBounds(114, 11, 186, 14);
        contentPane.add(lblNewLabel);
        
        JTextTitulo = new JTextField();
        JTextTitulo.setBounds(66, 67, 176, 20);
        contentPane.add(JTextTitulo);
        JTextTitulo.setColumns(10);
        
        jtextAutor = new JTextField();
        jtextAutor.setBounds(66, 116, 176, 20);
        contentPane.add(jtextAutor);
        jtextAutor.setColumns(10);
        
        JLabel lblTtulo = new JLabel("Título:");
        lblTtulo.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblTtulo.setBounds(10, 69, 38, 14);
        contentPane.add(lblTtulo);
        
        JLabel lblAutor = new JLabel("Autor:");
        lblAutor.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblAutor.setBounds(10, 118, 38, 14);
        contentPane.add(lblAutor);
        
        JButton btnRemoveL = new JButton("Remover Livro");
        btnRemoveL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Pega o título e o autor dos campos de texto
                String title = JTextTitulo.getText().trim();
                String author = jtextAutor.getText().trim();

                // Verifica se os campos estão preenchidos
                if (title.isEmpty() || author.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Tenta encontrar e remover o livro
                Livro livroParaRemover = null;
                for (Livro livro : livros) {
                    if (livro.getTitulo().equals(title) && livro.getAutor().equals(author)) {
                        livroParaRemover = livro;
                        break;
                    }
                }

                if (livroParaRemover != null) {
                    // Remove o livro da lista e da biblioteca
                    livros.remove(livroParaRemover);
                    biblioteca.removerLivro(livroParaRemover);
                    JOptionPane.showMessageDialog(null, "Livro removido com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Livro não encontrado na biblioteca.", "Erro", JOptionPane.ERROR_MESSAGE);
                }

                areaDeListaDeLivros.setText("");
            }
        });
        
        btnRemoveL.setBounds(66, 170, 176, 23);
        contentPane.add(btnRemoveL);
    }
}