import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import livro.Livro;

public class RemoverLivro {
  private JFrame frame;
  private JTextField campoDeEntrada;
  private JButton botaoRemover;
  private JTextArea areaDeListaDeLivros;
  private ArrayList<Livro> livros;

  public RemoverLivro() {
    frame = new JFrame("Remover Livro");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel painel = new JPanel();
    painel.setLayout(new BorderLayout());

    JLabel label = new JLabel("Digite o título do livro ou autor:");
    painel.add(label, BorderLayout.NORTH);

    campoDeEntrada = new JTextField();
    painel.add(campoDeEntrada, BorderLayout.CENTER);

    botaoRemover = new JButton("Remover Livro");
    botaoRemover.addActionListener(new RemoverLivroListener());
    painel.add(botaoRemover, BorderLayout.EAST);

    areaDeListaDeLivros = new JTextArea();
    JScrollPane scrollPane = new JScrollPane(areaDeListaDeLivros);
    painel.add(scrollPane, BorderLayout.SOUTH);

    frame.getContentPane().add(painel);
    frame.pack();
    frame.setVisible(true);

    livros = new ArrayList<>();

    livros.add(new Livro("Livro 1", "Autor 1", 200, "Editora 1", 2010, 4.5, "Inglês"));
    livros.add(new Livro("Livro 2", "Autor 2", 300, "Editora 2", 2015, 4.8, "Espanhol"));
    livros.add(new Livro("Livro 3", "Autor 3", 250, "Editora 3", 2012, 4.2, "Francês"));

    atualizarListaDeLivros();
  }

  private class RemoverLivroListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      String tituloOuAutor = campoDeEntrada.getText();
      removerLivro(tituloOuAutor);
      campoDeEntrada.setText(""); 
    }
  }

  private void removerLivro(String tituloOuAutor) {
    for (int i = 0; i < livros.size(); i++) {
      if (livros.get(i).getTitulo().equals(tituloOuAutor) || livros.get(i).getAutor().equals(tituloOuAutor)) {
        livros.remove(i);
        atualizarListaDeLivros();
        return;
      }
    }
  }

  private void atualizarListaDeLivros() {
    areaDeListaDeLivros.setText("");
    for (Livro livro : livros) {
      areaDeListaDeLivros.append("Título: " + livro.getTitulo() + "\n");
      areaDeListaDeLivros.append("Autor: " + livro.getAutor() + "\n");
      areaDeListaDeLivros.append("Páginas: " + livro.getPaginas() + "\n");
      areaDeListaDeLivros.append("Editora: " + livro.getEditora() + "\n");
      areaDeListaDeLivros.append("Ano: " + livro.getAno() + "\n");
      areaDeListaDeLivros.append("Avaliação: " + livro.getAvaliacao() + "\n");
      areaDeListaDeLivros.append("Idioma: " + livro.getIdioma() + "\n\n");
    }
  }
}