package service.serviceInterface;

import model.Product;

import java.util.List;

public interface IProductService extends IService <Product>  {
    List<Product> findByName(String name);

}
