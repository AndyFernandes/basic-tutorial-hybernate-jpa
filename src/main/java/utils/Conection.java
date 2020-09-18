package utils;

import dao.ClienteJpaDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conection {
    private static Conection instance;
    EntityManager entityManager;

    // padrão singleton
    public static Conection getInstance(){
        if (instance == null){
            instance = new Conection();
        }
        return instance;
    }

    private Conection() {
        entityManager = getEntityManager();
    }

    private EntityManager getEntityManager() {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("crudHibernatePU");
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }

        return entityManager;
    }
}
