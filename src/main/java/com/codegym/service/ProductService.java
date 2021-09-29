package com.codegym.service;

import com.codegym.dao.IProductDao;
import com.codegym.dao.ProductDao;
import com.codegym.model.Product;

import java.util.List;

public class ProductService implements IProductService {
    private IProductDao productDao = new ProductDao();

    @Override
    public List<Product> getAll() {
        return productDao.getAll();
    }

    @Override
    public void add(Product product) {
        productDao.add(product);
    }

    @Override
    public void update(int id, Product product) {
        productDao.update(id, product);
    }

    @Override
    public void delete(int id) {
        productDao.delete(id);
    }

    @Override
    public Product findById(int id) {
        return productDao.findById(id);
    }
}
