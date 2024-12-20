package model;

public class Funcionario extends Cliente {
    
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
		return "Funcionario [turno=" + turno + ", departamento=" + departamento + ", cargo=" + cargo + ", getTurno()="
				+ getTurno() + ", getDepartamento()=" + getDepartamento() + ", getCargo()=" + getCargo()
				+ ", toString()=" + super.toString() + ", getNome()=" + getNome() + ", getSexo()=" + getSexo()
				+ ", getIdade()=" + getIdade() + ", getTelefone()=" + getTelefone() + ", getCpf()=" + getCpf()
				+ ", getEmail()=" + getEmail() + ", getEndereco()=" + getEndereco() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}}