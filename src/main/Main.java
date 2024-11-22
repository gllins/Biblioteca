package main;

import java.sql.SQLException;

import dao.ClienteDAO;
import model.Cliente;

public class Main {
    public static void main(String[] args) throws SQLException {
        ClienteDAO clienteDao = new ClienteDAO(); 
        
        // Criando e salvando um novo cliente
      Cliente cliente = new Cliente();
        cliente.setNome("Thais");
        cliente.setIdade(36);
        cliente.setSexo("Feminino"); 
        cliente.setCpf("07239715442");
        cliente.setEmail("thais@gmail.com");
        cliente.setTelefone("999356848");
        cliente.setEndereco("Rua 08"); 
        clienteDao.save(cliente);
        
        //Lendo todos os clientes
       // List<Cliente> clientes = clienteDao.read();
      // System.out.println("Lista de Clientes:");
       // for (Cliente c : clientes) {
         //  System.out.println(c);
       // }

        // Atualizando o cliente
       // cliente.setIdade(16); // Alterando a idade
       // clienteDao.update(cliente);
        
        // Lendo os clientes após a atualização
       // clientes = clienteDao.read();
        //System.out.println("Lista de Clientes após atualização:");
       // for (Cliente c : clientes) {
           // System.out.println(c);
        }

	public static boolean save(Cliente cliente) {
		// TODO Auto-generated method stub
		return false;
	}

	public static void save(String nome, String idade, String email, String telefone, String endereco, String cpf,
			String sexo) {
		// TODO Auto-generated method stub
		
	}

        // Deletando o cliente
        //clienteDao.delete(cliente);
    }
//}