package controller;

import dao.ClienteJpaDAO;
import model.Cliente;

import javax.persistence.Column;

public class ClienteController {
    public void salvar(int id, String nome, String cpf, String rg) {
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        cliente.setId(id);
        cliente.setNome(nome);
        cliente.setRg(rg);
        ClienteJpaDAO.getInstance().merge(cliente);
        System.out.println(this + "\nSalvo com sucesso !");
    }

    public void remover(int id) {
        ClienteJpaDAO.getInstance().removeById(id);
        System.out.println(this + "\nRemovido com sucesso !");
    }

    public Cliente buscar(int id) {
        Cliente cliente = ClienteJpaDAO.getInstance().getById(id);
        System.out.println(cliente.getCpf());
        System.out.println(String.valueOf(cliente.getId()));
        System.out.println(cliente.getNome());
        System.out.println(cliente.getRg());
        return cliente;
    }
}
