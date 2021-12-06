package service.implement;

import model.Cart;
import model.Product;
import service.serviceInterface.ICartService;

import java.sql.*;
import java.util.List;

public class CartService implements ICartService {

    private final String SQL_EMPTY_CART = "{CALL empty_cart()}";
    private final String SQL_DELETE_PRODUCT_FROM_CART = "{CALL delete_product_from_cart(?)}";

    public CartService() {
    }

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/product_management?useSSL=false", "root", "123456");
        } catch (SQLException | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }


    @Override
    public boolean addProduct(Product product, int quantity) {
        return false;
    }

    @Override
    public boolean deleteProduct(int id) {
        try (Connection connection = getConnection();
             CallableStatement callableStatement = connection.prepareCall( SQL_DELETE_PRODUCT_FROM_CART);) {
            int result = callableStatement.executeUpdate();
            return result >= 1;
        } catch (SQLException e) {
            printSQLException(e);
        }
        return false;
    }

    @Override
    public boolean deleteAllProducts() {
        try (Connection connection = getConnection();
             CallableStatement callableStatement = connection.prepareCall(SQL_EMPTY_CART);) {
            int result = callableStatement.executeUpdate();
            return result >= 1;
        } catch (SQLException e) {
            printSQLException(e);
        }
        return false;
    }

    @Override
    public boolean increaseQuantity(Product product) {
        return false;
    }

    @Override
    public boolean decreaseQuantity(Product product) {
        return false;
    }

    @Override
    public double calTotal(int userId) {
        return 0;
    }

    @Override
    public List<Cart> findAll() throws SQLException {
        return null;
    }

    @Override
    public void save(Cart cart) throws SQLException {

    }

    @Override
    public void update(int id, Cart cart) throws SQLException {

    }

    @Override
    public void delete(int id) throws SQLException {

    }

    @Override
    public Cart findById(int id) throws SQLException {
        return null;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
