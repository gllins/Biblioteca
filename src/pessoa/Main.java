package pessoa;

import livro.Biblioteca;
import view.AdicionarLivro;
import view.RemoverLivro;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        AdicionarLivro adicionarLivro = new AdicionarLivro(biblioteca);
        adicionarLivro.setVisible(true);

        RemoverLivro removerLivro = new RemoverLivro(biblioteca);
        removerLivro.setVisible(true);
    }
}