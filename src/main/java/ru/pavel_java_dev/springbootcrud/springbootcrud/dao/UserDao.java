package ru.pavel_java_dev.springbootcrud.springbootcrud.dao;

import ru.pavel_java_dev.springbootcrud.springbootcrud.models.User;

import java.util.List;

public interface UserDao {

    void save(User user);

    User get(long id);

    void update(long id, User user);

    void delete(long id);

    List<User> list();
}
