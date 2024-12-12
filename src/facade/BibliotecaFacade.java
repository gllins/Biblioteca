package facade;

import dao.ClienteDAO;
import dao.FuncionarioDAO;
import dao.LivroDAO;
import model.Cliente;
import model.Funcionario;
import model.Livro;

public class BibliotecaFacade {

    private ClienteDAO clienteDAO;
    private LivroDAO livroDAO;
    private FuncionarioDAO funcionarioDAO;

    public BibliotecaFacade() {
        this.clienteDAO = new ClienteDAO();
        this.livroDAO = new LivroDAO();
        this.funcionarioDAO = new FuncionarioDAO();
    }

    public void cadastrarCliente(Cliente cliente) {
        clienteDAO.save(cliente); 
    }

    public void cadastrarLivro(Livro livro) {
        livroDAO.save(livro);
    }

    public void cadastrarFuncionario(Funcionario funcionario) {
        funcionarioDAO.save(funcionario);
    }

    public void atualizarFuncionario(Funcionario funcionario) {
        funcionarioDAO.update(funcionario);
    }

    public void atualizarCliente(Cliente cliente) {
        clienteDAO.update(cliente); 
    }

    public void atualizarLivro(Livro livro) {
        livroDAO.update(livro);
    }

    public void deletarFuncionario(Funcionario funcionario) {
        funcionarioDAO.delete(funcionario);
    }

    public void deletarCliente(Cliente cliente) {
        clienteDAO.delete(cliente); 
    }

    public void deletarLivro(Livro livro) {
        livroDAO.delete(livro);
    }

    public void lerFuncionarios() {
        funcionarioDAO.read();
    }

    public void lerClientes() {
        clienteDAO.read(); 
    }

    public void lerLivros() {
        livroDAO.read();
    }
}