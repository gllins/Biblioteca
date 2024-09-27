package livro;

public class Livro {
  private String titulo;
  private String autor;
  private int paginas;
  private String editora;
  private int ano;
  private double avaliacao;
  private String idioma;

  public Livro(String titulo, String autor, int paginas, String editora, int ano, double avaliacao, String idioma) {
    this.titulo = titulo;
    this.autor = autor;
    this.paginas = paginas;
    this.editora = editora;
    this.ano = ano;
    this.avaliacao = avaliacao;
    this.idioma = idioma;
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
}