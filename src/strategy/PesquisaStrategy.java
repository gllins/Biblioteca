package strategy;
import model.Livro;
import java.util.List;

public interface PesquisaStrategy {
	public List<Livro>
	pesquisar(List<Livro> livros, String termo);
}
