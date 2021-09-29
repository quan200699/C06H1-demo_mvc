package com.codegym.dao;

import com.codegym.model.Product;

import java.util.List;

public interface IProductDao {
    List<Product> getAll();

    void add(Product product);

    void update(int id, Product product);

    void delete(int id);

    Product findById(int id);
}
