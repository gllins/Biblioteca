package livro;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public void removerLivro(Livro livro) {
        this.livros.remove(livro);
    }

    public List<Livro> getLivros() {
        return this.livros;
    }

	public void setLivros(ArrayList<Livro> livros2) {
		// TODO Auto-generated method stub
		
	}
}