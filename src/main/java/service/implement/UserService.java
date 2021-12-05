package service.implement;

import model.User;
import service.serviceInterface.IUserService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserService implements IUserService {
    private String jdbcURL = "jdbc:mysql://localhost:3306/product_management?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "123456";

    private final String INSERT_USERS_SQL = "INSERT INTO users" + " (name, email, password) VALUES " + " (?, ?, ?);";
    private final String SELECT_USER_BY_EMAIL_PASS = "select * from users where email like ? and password like ?";
    private final String SELECT_USER_BY_EMAIL = "select id, name, email, password, role, image from user where email like ?";
    private final String SELECT_USER_BY_ID = "select * from users where id = ?";
    private final String SELECT_ALL_USERS = "select * from users";
    private final String DELETE_USERS_SQL = "delete from users where id = ?;";
    private final String UPDATE_USERS_SQL = "update users set name = ?, email= ?, password = ?, role =?, image = ? where id = ?";

    public UserService() {
    }

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
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
    public List<User> findAll() throws SQLException {
//        List<User> userList = new ArrayList<>();
//        try (Connection connection = getConnection();
//             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);) {
//            System.out.println(preparedStatement);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()) {
//                int id = resultSet.getInt("id");
//                String name = resultSet.getString("name");
//                String email = resultSet.getString("email");
//                String password = resultSet.getString("password");
//                int role = resultSet.getInt("role");
//                String image = resultSet.getString("image");
//                userList.add(new User(id, name, email, password, role, image));
//            }
//        } catch (SQLException e) {
//        }
//        return userList;
        List<User> users = new ArrayList<>();
        // Step 1: Establishing a Connection
        try (Connection connection = getConnection();

             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);) {
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet resultSet = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");
                int role = resultSet.getInt("role");
                String image = resultSet.getString("image");
                users.add(new User(id, name, email, password, role, image));
            }
        } catch (SQLException e) {
        }
        return users;
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




