package model;

import observer.Observer;

public class Cliente implements Observer {
    private String nome;
    private String sexo;
    private int idade;
    private String telefone;
    private String cpf;
    private String email;
    private String endereco;

    public Cliente() {
    }

    public Cliente(String nome, String sexo, int idade, String telefone, String cpf, String email, String endereco) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.telefone = telefone;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
    }


    @Override
    public void update(String mensagem) {
        System.out.println("Notificação recebida por " + nome + ": " + mensagem);
      
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", telefone=" + telefone + 
               ", cpf=" + cpf + ", email=" + email + ", endereco=" + endereco + "]";
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
}
