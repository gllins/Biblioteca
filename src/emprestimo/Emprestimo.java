package emprestimo;

import livro.Livro;
import pessoa.Pessoa;
import java.time.LocalDate;

public class Emprestimo {
    private Livro livro;
    private Pessoa funcionario;
    private Pessoa cliente;
    private LocalDate dataInicio;
    private LocalDate dataDevolucao;
    private String periodoTotal;
    private String statusEmprestimo;
    private float taxaMulta;

    public Emprestimo(Livro livro, Pessoa funcionario, Pessoa cliente, LocalDate dataInicio, LocalDate dataDevolucao, String periodoTotal, String statusEmprestimo, float taxaMulta) {
        this.livro = livro;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.dataInicio = dataInicio;
        this.dataDevolucao = dataDevolucao;
        this.periodoTotal = periodoTotal;
        this.statusEmprestimo = statusEmprestimo;
        this.taxaMulta = taxaMulta;
    }

    public Livro getL() {
        return livro;
    }

    public Pessoa getF() {
        return funcionario;
    }

    public Pessoa getC() {
        return cliente;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public String getPeriodoTotal() {
        return periodoTotal;
    }

    public String getStatus_emprestimo() {
        return statusEmprestimo;
    }

    public float getTaxa_multa() {
        return taxaMulta;
    }
}