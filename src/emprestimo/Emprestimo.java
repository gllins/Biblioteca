package emprestimo;

import java.util.Date;

import livro.Livro;
import pessoa.Pessoa;


public class Emprestimo {
	Livro l;
	Pessoa f;
	Pessoa c;
	Date dataInic;
	Date dataDevol;
	String periodoTotal;
	String status_emprestimo;
	float taxa_multa;
	
	
	
	@Override
	public String toString() {
		return "Emprestimo [l=" + l + ", f=" + f + ", c=" + c + ", dataInic=" + dataInic + ", dataDevol=" + dataDevol
				+ ", periodoTotal=" + periodoTotal + ", status_emprestimo=" + status_emprestimo + ", taxa_multa="
				+ taxa_multa + ", getL()=" + getL() + ", getF()=" + getF() + ", getC()=" + getC() + ", getDataInic()="
				+ getDataInic() + ", getDataDevol()=" + getDataDevol() + ", getPeriodoTotal()=" + getPeriodoTotal()
				+ ", getStatus_emprestimo()=" + getStatus_emprestimo() + ", getTaxa_multa()=" + getTaxa_multa()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public Emprestimo(Livro l, Pessoa f, Pessoa c, Date dataInic, Date dataDevol, String periodoTotal,
			String status_emprestimo, float taxa_multa) {
		super();
		this.l = l;
		this.f = f;
		this.c = c;
		this.dataInic = dataInic;
		this.dataDevol = dataDevol;
		this.periodoTotal = periodoTotal;
		this.status_emprestimo = status_emprestimo;
		this.taxa_multa = taxa_multa;
	}
	public Emprestimo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emprestimo(Livro livro, Pessoa f2, Pessoa c2, String string, String string2, String periodoTotal2,
			String status_emprestimo2, int taxa_multa2) {
		// TODO Auto-generated constructor stub
	}
	public Livro getL() {
		return l;
	}
	public void setL(Livro l) {
		this.l = l;
	}
	public Pessoa getF() {
		return f;
	}
	public void setF(Pessoa f) {
		this.f = f;
	}
	public Pessoa getC() {
		return c;
	}
	public void setC(Pessoa c) {
		this.c = c;
	}
	public Date getDataInic() {
		return dataInic;
	}
	public void setDataInic(Date dataInic) {
		this.dataInic = dataInic;
	}
	public Date getDataDevol() {
		return dataDevol;
	}
	public void setDataDevol(Date dataDevol) {
		this.dataDevol = dataDevol;
	}
	public String getPeriodoTotal() {
		return periodoTotal;
	}
	public void setPeriodoTotal(String periodoTotal) {
		this.periodoTotal = periodoTotal;
	}
	public String getStatus_emprestimo() {
		return status_emprestimo;
	}
	public void setStatus_emprestimo(String status_emprestimo) {
		this.status_emprestimo = status_emprestimo;
	}
	public float getTaxa_multa() {
		return taxa_multa;
	}
	public void setTaxa_multa(float taxa_multa) {
		this.taxa_multa = taxa_multa;
	}
	public Object getHistorico() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
	
	