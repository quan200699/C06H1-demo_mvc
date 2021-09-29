package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAll();

    void add(Product product);

    void update(int id, Product product);

    void delete(int id);

    Product findById(int id);
}
