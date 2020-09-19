package utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conection {
    private static EntityManager entityManager;

    public static EntityManager getEntityManager() {
        if (entityManager == null) {
            EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("default");
            entityManager = factory.createEntityManager();
        }
        return entityManager;
    }
}
