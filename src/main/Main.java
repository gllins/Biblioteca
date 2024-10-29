package main;

import java.sql.SQLException;

import dao.ClienteDao;
import model.Cliente;

public class Main {
    public static void main(String[] args) throws SQLException {
        ClienteDao clienteDao = new ClienteDao(); 
        
        // Criando e salvando um novo cliente
      Cliente cliente = new Cliente();
        cliente.setNome("Giulia");
        cliente.setIdade(15);
        cliente.setSexo("Feminino"); 
        cliente.setCpf(1117744141);
        cliente.setEmail("giulia@gmail.com");
        cliente.setTelefone(99996666);
        cliente.setEndereco("Rua 14"); 
        clienteDao.update(cliente);
        
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

        // Deletando o cliente
        //clienteDao.delete(cliente);
    }
//}