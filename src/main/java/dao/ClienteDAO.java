package dao;

import model.Cliente;
import utils.Conection;

import java.util.List;

public class ClienteDAO {
    public Cliente getById(final int id) {
        return Conection.getEntityManager().find(Cliente.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<Cliente> findAll() {
        return Conection.getEntityManager().createQuery("FROM " +
                Cliente.class.getName()).getResultList();
    }

    public void persist(Cliente cliente) {
        try {
            Conection.getEntityManager().getTransaction().begin();
            Conection.getEntityManager().persist(cliente);
            Conection.getEntityManager().getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            Conection.getEntityManager().getTransaction().rollback();
        }
    }

    public void merge(Cliente cliente) {
        try {
            Conection.getEntityManager().getTransaction().begin();
            Conection.getEntityManager().merge(cliente);
            Conection.getEntityManager().getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            Conection.getEntityManager().getTransaction().rollback();
        }
    }

    public void remove(Cliente cliente) {
        try {
            Conection.getEntityManager().getTransaction().begin();
            cliente = Conection.getEntityManager().find(Cliente.class, cliente.getId());
            Conection.getEntityManager().remove(cliente);
            Conection.getEntityManager().getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            Conection.getEntityManager().getTransaction().rollback();
        }
    }

    public void removeById(final int id) {
        try {
            Cliente cliente = getById(id);
            remove(cliente);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
