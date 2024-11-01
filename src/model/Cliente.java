package model;

public class Cliente {
    private String nome;
    private String sexo;
    private int idade;
    private String telefone;
    private String cpf;
    private String email;
    private String endereco;

    public Cliente() {
		// TODO Auto-generated constructor stub
	}

	@Override
    public String toString() {
        return "Cliente [nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", telefone=" + telefone + 
               ", cpf=" + cpf + ", email=" + email + ", endereco=" + endereco + "]";
    }

    // Getters e Setters
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
}