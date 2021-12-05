package service.implement;

import model.Cart;
import model.Product;
import service.serviceInterface.ICartService;

import java.sql.SQLException;
import java.util.List;

public class CartService implements ICartService {
    @Override
    public boolean addProduct(Product product, int quantity) {
        return false;
    }

    @Override
    public boolean deleteProduct(Product product) {
        return false;
    }

    @Override
    public boolean deleteAllProducts() {
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
}
