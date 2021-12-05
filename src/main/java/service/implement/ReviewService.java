package service.implement;

import model.Product;
import model.Review;
import model.User;
import service.serviceInterface.IReviewService;

import java.sql.SQLException;
import java.util.List;

public class ReviewService implements IReviewService {
    @Override
    public List<Review> findAllByProduct(Product product) throws SQLException {
        return null;
    }

    @Override
    public List<Review> findAllByUser(User user) throws SQLException {
        return null;
    }

    @Override
    public List<Review> findAll() throws SQLException {
        return null;
    }

    @Override
    public void save(Review review) throws SQLException {

    }

    @Override
    public void update(int id, Review review) throws SQLException {

    }

    @Override
    public void delete(int id) throws SQLException {

    }

    @Override
    public Review findById(int id) throws SQLException {
        return null;
    }
}
