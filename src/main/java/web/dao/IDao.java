package web.dao;

import web.model.User;

import java.util.List;

public interface IDao {
    void add(User user);
    List<User> listUsers();
    void delete(User user);
    void update(User user);
}
