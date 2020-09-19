package controller;

import dao.ClienteDAO;
import model.Cliente;

import java.util.List;

public class ClienteController {
    ClienteDAO clienteDAO;

    public ClienteController(){
        this.clienteDAO = new ClienteDAO();
    }

    public void insert(int id, String nome, String cpf, String rg){
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        cliente.setId(id);
        cliente.setNome(nome);
        cliente.setRg(rg);
        clienteDAO.persist(cliente);
        System.out.println(this + "\nSalvo com sucesso !");
    }

    public void update(int id, String nome, String cpf, String rg) {
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        cliente.setId(id);
        cliente.setNome(nome);
        cliente.setRg(rg);
        clienteDAO.merge(cliente);
        System.out.println(this + "\nSalvo com sucesso !");
    }

    public void delete(int id) {
        clienteDAO.removeById(id);
        System.out.println(this + "\nRemovido com sucesso !");
    }

    public Cliente find(int id) {
        Cliente cliente = clienteDAO.getById(id);
        System.out.println(cliente.getCpf());
        System.out.println(String.valueOf(cliente.getId()));
        System.out.println(cliente.getNome());
        System.out.println(cliente.getRg());
        return cliente;
    }

    public List<Cliente> findAll(){
        return clienteDAO.findAll();
    }
}
