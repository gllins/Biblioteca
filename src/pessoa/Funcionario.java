package pessoa;

public class Funcionario extends Pessoa {
	private String cargo;
	private String departamento;
	private String turno;
	
	
	
	public Funcionario(String cargo, String departamento, String turno) {
		super();
		this.cargo = cargo;
		this.departamento = departamento;
		this.turno = turno;
	}
	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Funcionario(String nome, int id, String cpf, int idade, String sexo, String telefone, String endereco,
			String email) {}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
}
