package service.implement;

import model.User;
import service.serviceInterface.IUserService;

import java.sql.SQLException;
import java.util.List;

public class UserService implements IUserService {
    @Override
    public List<User> findAll() throws SQLException {
        return null;
    }

    @Override
    public void save(User user) throws SQLException {

    }

    @Override
    public void update(int id, User user) throws SQLException {

    }

    @Override
    public void delete(int id) throws SQLException {

    }

    @Override
    public User findById(int id) throws SQLException {
        return null;
    }

    @Override
    public User findByEmail(String email) {
        return null;
    }

    @Override
    public User verifyLogin(String username, String password) {
        return null;
    }
}
