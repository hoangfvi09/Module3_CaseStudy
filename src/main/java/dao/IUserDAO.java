package dao;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDAO {
    void insert(User user) throws SQLException, ClassNotFoundException;

    List<User> findAll() throws SQLException, ClassNotFoundException;

    User findById(int id) throws SQLException, ClassNotFoundException;

    boolean delete(int id) throws SQLException, ClassNotFoundException;

    boolean update(User user) throws SQLException, ClassNotFoundException;

    List<User> findByName(String username) throws SQLException, ClassNotFoundException;

    User findByUsernamePass(String username, String password) throws SQLException, ClassNotFoundException;

}
