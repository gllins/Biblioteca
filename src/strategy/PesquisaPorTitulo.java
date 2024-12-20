package strategy;

import java.util.ArrayList;
import java.util.List;

import model.Livro;

public class PesquisaPorTitulo implements PesquisaStrategy {
    public List<Livro> pesquisar(List<Livro> livros, String termo) {
        List<Livro> resultado = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.getTitulo().contains(termo)) {
                resultado.add(livro);
            }
        }
        return resultado;
    }

	
}
