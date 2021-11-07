package ru.vladborisov.liquibasedemo.dao;

import ru.vladborisov.liquibasedemo.model.User;

public interface UserDao {
    void saveUser(User user);
}
