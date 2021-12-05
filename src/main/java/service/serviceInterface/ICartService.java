package service.serviceInterface;

import model.Cart;
import model.Product;

public interface ICartService extends IService <Cart> {
    boolean addProduct (Product product, int quantity);
    boolean deleteProduct (Product product);
    boolean increaseQuantity (Product product);
    boolean decreaseQuantity (Product product);
    double calTotal(int userId);
}
