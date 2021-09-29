package com.codegym.dao;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDao implements IProductDao {
    public static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "Samsung", "New", 2000000, ""));
        products.add(new Product(2, "Samsung1", "New", 2400000, ""));
        products.add(new Product(3, "Samsung2", "New", 2500000, ""));
        products.add(new Product(4, "Samsung3", "New", 2600000, ""));
        products.add(new Product(5, "Samsung4", "New", 2700000, ""));
    }

    @Override
    public List<Product> getAll() {
        //select * from products
        return products;
    }

    @Override
    public void add(Product product) {
        //insert into
        products.add(product);
    }

    @Override
    public void update(int id, Product product) {
        //update
        Product oldProduct = findById(id);
        if (oldProduct != null) {
            oldProduct.setDescription(product.getDescription());
            oldProduct.setName(product.getName());
            oldProduct.setImage(product.getImage());
            oldProduct.setPrice(product.getPrice());
        }
    }

    @Override
    public void delete(int id) {
        //delete
        Product oldProduct = findById(id);
        products.remove(oldProduct);
    }

    @Override
    public Product findById(int id) {
        //select + where
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                return products.get(i);
            }
        }
        return null;
    }
}
