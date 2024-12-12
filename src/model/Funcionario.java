package model;

public class Funcionario {
    private String nome;
    private String sexo;
    private int idade;
    private String telefone;
    private String cpf;
    private String email;
    private String endereco;
    private String turno;
    private String departamento;
    private String cargo;

    public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public Funcionario(String string, String string2, int i, String string3, String string4, String string5,
			String string6) {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", telefone=" + telefone + ", cpf="
				+ cpf + ", email=" + email + ", endereco=" + endereco + ", turno=" + turno + ", departamento="
				+ departamento + ", cargo=" + cargo + ", getNome()=" + getNome() + ", getSexo()=" + getSexo()
				+ ", getIdade()=" + getIdade() + ", getTelefone()=" + getTelefone() + ", getCpf()=" + getCpf()
				+ ", getEmail()=" + getEmail() + ", getEndereco()=" + getEndereco() + ", getTurno()=" + getTurno()
				+ ", getDepartamento()=" + getDepartamento() + ", getCargo()=" + getCargo() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}}

	