package pessoa;

import emprestimo.Emprestimo;
import livro.Livro;


public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cpfC = "03306830046";
		String cpfF = "66464760041";

		
		Pessoa c;
		Pessoa f;
		
				
			c = new Cliente("Giulia", 123, cpfC, 15, "F","9 9988-7766", "Rua 15", "giulia@gmail.com");
			
			c.setNome("Giulia");
			c.setId(123);
			c.setCpf(cpfC);
			c.setIdade(15);
			c.setSexo("F");
			c.setTelefone("9 9988-7766");
			c.setEndereco("Rua 15");
			c.setEmail("giulia@gmail.com");
			
			System.out.println(c.toString());
		
		
			f = new Funcionario("Antonio", 321, cpfF, 41, "M", "9 3322-1100", "Rua 12", "antonio@gmail.com");
			
			f.setNome("Antonio");
			f.setId(321);
			f.setCpf(cpfF);
			f.setIdade(41);
			f.setSexo("M");
			f.setTelefone("9 3322-1100");
			f.setEndereco("Rua 12");
			f.setEmail("antonio@gmail.com");
			
			System.out.println(f.toString());
		
	
	
			Livro livro  = new Livro("Corte das corujas", "Greg Cox", "Ficcao", "2018-06-12");
		
		livro.setTitulo("Corte das corujas");
		livro.setAutor("Greg Cox");
		livro.setGenero("Ficcao");
		livro.setDt_lancamento("2018-06-12");
		
		
		System.out.println(livro.toString());
	
	
		Emprestimo e1 = new Emprestimo(livro, f, c, "2024-08-19","2024-09-03", "15 dias", "Devolucao realizada com sucesso", 0);
		Emprestimo e2 = new Emprestimo(livro, f, c, "2024-08-21", "2024-09-05", "20 dias", "Devolucao realizada com atraso", 5);
		Emprestimo e3 = new Emprestimo(livro, f, c, "2024-10-01", "2024-10-16", "Pendente", "Devolucao pendente", 0);
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
		
		
	}

}

	