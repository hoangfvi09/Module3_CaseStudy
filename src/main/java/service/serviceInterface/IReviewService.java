package service.serviceInterface;

import model.Product;
import model.Review;
import model.User;

import java.sql.SQLException;
import java.util.List;

public interface IReviewService extends IService<Review> {
    List<Review> findAllByProduct(int id) throws SQLException;

    List<Review> findAllByUser(int id) throws SQLException;


}
