package strategy;

import java.util.ArrayList;
import java.util.List;

import model.Livro;

public class PesquisaPorAutor implements PesquisaStrategy {
    @Override
    public List<Livro> pesquisar(List<Livro> livros, String termo) {
        List<Livro> resultado = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.getAutor().contains(termo)) {
                resultado.add(livro);
            }
        }
        return resultado;
    }
}