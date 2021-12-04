package dao;

import model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO implements IUserDAO {
    private final String INSERT_USERS_SQL = "INSERT INTO user" + " (username, password, email) VALUES " + " (?, ?, ?);";
    private final String SELECT_USER_BY_USERNAME_PASS = "select * from user where username like ? and password like ?";
    private final String SELECT_USER_BY_USERNAME = "select id, username, password, email, address, avatar from user where username like ?";
    private final String SELECT_USER_BY_ID = "select * from user where id = ?";
    private final String SELECT_ALL_USERS = "select * from user";
    private final String DELETE_USERS_SQL = "delete from user where id = ?;";
    private final String UPDATE_USERS_SQL = "update user set username = ?, password = ?,  email= ?, address =?, avatar = ? where id = ?";

    public UserDAO() {

    }

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo20062?useSSL=false", "root", "123456");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }

    @Override
    public void insert(User user) throws SQLException, ClassNotFoundException {
        List<User> users = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL);) {
            System.out.println(preparedStatement);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
        }
    }

    @Override
    public List<User> findAll() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public User findById(int id) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public boolean delete(int id) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean update(User user) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public List<User> findByName(String username) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public User findByUsernamePass(String username, String password) throws SQLException, ClassNotFoundException {
        return null;
    }
}
