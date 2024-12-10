package model;

import java.sql.Blob;

public class Livro {
  private String titulo;
  private String autor;
  private int paginas;
  private String editora;
  private int ano;
  private double avaliacao;
  private String idioma;
  private Blob imagem;

  public Livro(String titulo, String autor, int paginas, String editora, int ano, double avaliacao, String idioma) {
    this.titulo = titulo;
    this.autor = autor;
    this.paginas = paginas;
    this.editora = editora;
    this.ano = ano;
    this.avaliacao = avaliacao;
    this.idioma = idioma;
  }


  public Livro() {
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

  public int getPaginas() {
    return paginas;
  }

  public void setPaginas(int paginas) {
    this.paginas = paginas;
  }

  public String getEditora() {
    return editora;
  }

  public void setEditora(String editora) {
    this.editora = editora;
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public double getAvaliacao() {
    return avaliacao;
  }

  public void setAvaliacao(double avaliacao) {
    this.avaliacao = avaliacao;
  }

  public String getIdioma() {
    return idioma;
  }

  public void setIdioma(String idioma) {
    this.idioma = idioma;
  }


public void add(Livro livro) {
	// TODO Auto-generated method stub
	
}


public Blob getImagem() {
	return imagem;
}


public void setImagem(Blob imagem) {
	this.imagem = imagem;
}




}