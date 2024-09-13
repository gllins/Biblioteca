package livro;

import java.util.Date;

public class Livro {
	private String titulo;
	private String autor;
	private String genero;
	private Date dt_lancamento;
	
	
	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + ", dt_lancamento="
				+ dt_lancamento + ", getTitulo()=" + getTitulo() + ", getAutor()=" + getAutor() + ", getGenero()="
				+ getGenero() + ", getDt_lancamento()=" + getDt_lancamento() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Livro(String titulo, String autor, String genero, Date dt_lancamento) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.dt_lancamento = dt_lancamento;
	}
	public Livro() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Livro(String titulo2, String autor2, String genero2, String string) {
		// TODO Auto-generated constructor stub
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Date getDt_lancamento() {
		return dt_lancamento;
	}
	public void setDt_lancamento(Date dt_lancamento) {
		this.dt_lancamento = dt_lancamento;
	}
	public void setDt_lancamento(String string) {
		// TODO Auto-generated method stub
		
	}
}
