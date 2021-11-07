package ru.vladborisov.liquibasedemo.dao;

import org.springframework.stereotype.Repository;
import ru.vladborisov.liquibasedemo.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveUser(User user) {
        entityManager.persist(user);
    }
}
