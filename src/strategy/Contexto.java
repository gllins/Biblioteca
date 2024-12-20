package strategy;
import java.util.List;

import model.Livro;

public class Contexto {
    private PesquisaStrategy strategy;

    // Define a estratégia de pesquisa
    public void setStrategy(PesquisaStrategy strategy) {
        this.strategy = strategy;
    }

    // Método para executar a pesquisa com a estratégia atual
    public List<Livro> realizarPesquisa(List<Livro> livros, String termo) {
        return strategy.pesquisar(livros, termo);
    }
}