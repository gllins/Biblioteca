package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import dao.LivroDAO;
import model.Livro;
import strategy.PesquisaPorAutor;
import strategy.PesquisaPorTitulo;
import strategy.Contexto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ListaLivros extends JFrame {
    private static final long serialVersionUID = 1L;

    // Componentes da tela
    private JTable tabela;
    private DefaultTableModel modelo;
    private JComboBox<String> comboBox;
    private JTextField termoField;

    // Dados
    private List<Livro> livros;
    private LivroDAO livroDAO;

    public ListaLivros() {
        // Configuração da janela
        setTitle("Tabela com Pesquisa");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(800, 500);
        setLayout(null);

        // Inicializar DAO e recuperar livros
        livroDAO = new LivroDAO();
        livros = livroDAO.read();

        // Inicializar componentes
        initComponents();

        // Preencher tabela inicialmente
        preencherTabela(livros);
    }

    private void initComponents() {
        // Modelo da tabela
        modelo = new DefaultTableModel();
        modelo.addColumn("Título");
        modelo.addColumn("Autor");
        modelo.addColumn("Páginas");
        modelo.addColumn("Editora");
        modelo.addColumn("Ano");
        modelo.addColumn("Avaliação");
        modelo.addColumn("Idioma");

        // Configurar tabela
        tabela = new JTable(modelo);
        JScrollPane scrollPane = new JScrollPane(tabela);
        scrollPane.setBounds(10, 50, 760, 350);
        add(scrollPane);

        // Componentes de pesquisa
        JLabel pesquisaLabel = new JLabel("Pesquisar por:");
        pesquisaLabel.setBounds(10, 10, 100, 25);
        add(pesquisaLabel);

        comboBox = new JComboBox<>(new String[]{"Título", "Autor"});
        comboBox.setBounds(110, 10, 100, 25);
        add(comboBox);

        termoField = new JTextField();
        termoField.setBounds(220, 10, 200, 25);
        add(termoField);

        JButton pesquisarButton = new JButton("Pesquisar");
        pesquisarButton.setBounds(430, 10, 100, 25);
        add(pesquisarButton);

        // Ação do botão de pesquisa
        pesquisarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarPesquisa();
            }
        });
    }

    private void realizarPesquisa() {
        String termo = termoField.getText();
        String estrategiaSelecionada = (String) comboBox.getSelectedItem();

        // Contexto e Estratégia
        Contexto contexto = new Contexto();
        if ("Título".equals(estrategiaSelecionada)) {
            contexto.setStrategy(new PesquisaPorTitulo());
        } else if ("Autor".equals(estrategiaSelecionada)) {
            contexto.setStrategy(new PesquisaPorAutor());
        }

        // Realizar pesquisa e atualizar tabela
        List<Livro> resultados = contexto.realizarPesquisa(livros, termo);
        preencherTabela(resultados);
    }

    private void preencherTabela(List<Livro> lista) {
        modelo.setRowCount(0); // Limpar a tabela
        for (Livro livro : lista) {
            modelo.addRow(new Object[]{
                    livro.getTitulo(),
                    livro.getAutor(),
                    livro.getPaginas(),
                    livro.getEditora(),
                    livro.getAno(),
                    livro.getAvaliacao(),
                    livro.getIdioma()
            });
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ListaLivros frame = new ListaLivros();
            frame.setVisible(true);
        });
    }
}