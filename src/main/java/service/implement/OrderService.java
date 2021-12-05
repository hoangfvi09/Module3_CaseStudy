package service.implement;

import model.Order;
import model.User;
import service.serviceInterface.IOrderService;

import java.sql.SQLException;
import java.util.List;

public class OrderService implements IOrderService {
    @Override
    public List<Order> findByUser(User user) {
        return null;
    }

    @Override
    public List<Order> findByStatus(int status) {
        return null;
    }

    @Override
    public boolean changeStatus(int status) {
        return false;
    }

    @Override
    public boolean checkStatus(Order order) {
        return false;
    }

    @Override
    public boolean changeAddress(Order order, String address) {
        return false;
    }

    @Override
    public boolean changePhoneNo(Order order, String phoneNo) {
        return false;
    }

    @Override
    public List<Order> findAll() throws SQLException {
        return null;
    }

    @Override
    public void save(Order order) throws SQLException {

    }

    @Override
    public void update(int id, Order order) throws SQLException {

    }

    @Override
    public void delete(int id) throws SQLException {

    }

    @Override
    public Order findById(int id) throws SQLException {
        return null;
    }
}
