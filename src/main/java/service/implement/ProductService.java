package service.implement;

import model.Product;
import service.serviceInterface.IProductService;

import java.sql.SQLException;
import java.util.List;

public class ProductService implements IProductService {
    @Override
    public List<Product> findByName(String name) {
        return null;
    }

    @Override
    public List<Product> findByCategory(String categoryName) {
        return null;
    }

    @Override
    public List<Product> findBySize(int size) {
        return null;
    }

    @Override
    public List<Product> findAllPriceDesc() {
        return null;
    }

    @Override
    public List<Product> findAllPriceAsc() {
        return null;
    }

    @Override
    public List<Product> findByPrice(double max, double min) {
        return null;
    }

    @Override
    public List<Product> findAll() throws SQLException {
        return null;
    }

    @Override
    public void save(Product product) throws SQLException {

    }

    @Override
    public void update(int id, Product product) throws SQLException {

    }

    @Override
    public void delete(int id) throws SQLException {

    }

    @Override
    public Product findById(int id) throws SQLException {
        return null;
    }
}
