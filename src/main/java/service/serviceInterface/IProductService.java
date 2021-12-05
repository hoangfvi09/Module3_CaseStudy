package service.serviceInterface;

import model.Product;

import java.util.List;

public interface IProductService extends IService<Product> {
    List<Product> findByName(String name);

    List<Product> findByCategory(String categoryName);

    List<Product> findBySize(int size);

    List<Product> findAllPriceDesc();

    List<Product> findAllPriceAsc();

    List<Product> findByPrice(double max, double min);



}
