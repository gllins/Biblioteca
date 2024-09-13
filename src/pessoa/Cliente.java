package pessoa;

public class Cliente extends Pessoa{
	private float taxa_multa;
	private int limite_emprestimo;
	private String status_empestimno;
	private String livros;
	
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(float taxa_multa, int limite_emprestimo, String status_empestimno, String livros) {
		super();
		this.taxa_multa = taxa_multa;
		this.limite_emprestimo = limite_emprestimo;
		this.status_empestimno = status_empestimno;
		this.livros = livros;
	}

	public Cliente(String nome, int id, String cpf, int idade, String sexo, String telefone, String endereco,
			String email) {}
	public float getTaxa_multa() {
		return taxa_multa;
	}
	public void setTaxa_multa(float taxa_multa) {
		this.taxa_multa = taxa_multa;
	}
	public int getLimite_emprestimo() {
		return limite_emprestimo;
	}
	public void setLimite_emprestimo(int limite_emprestimo) {
		this.limite_emprestimo = limite_emprestimo;
	}
	public String getStatus_empestimno() {
		return status_empestimno;
	}
	public void setStatus_empestimno(String status_empestimno) {
		this.status_empestimno = status_empestimno;
	}
	public String getLivros() {
		return livros;
	}
	public void setLivros(String livros) {
		this.livros = livros;
	}
}
