package com.example.login.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Deprecated
@Repository
public class LoginDAO {
    @PersistenceContext
    private EntityManager entityManager;

    public String executeQuery() {
        // Create a query
        Object query = entityManager.createNativeQuery("SELECT NOW()").getSingleResult();
        // Execute the query
        //List<User> users = query.getResultList();

        // Iterate over the results
        /*for (User user : users) {
            System.out.println(user.getName());
        }*/
        return query.toString();
    }


}
