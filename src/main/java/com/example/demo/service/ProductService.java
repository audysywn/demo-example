package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Product;

public interface ProductService {
	
    Product findByProductCode(String productCode);

    List<Product> findAll();
    
    List<Product> findAllByOrderByRatingDesc();

    Product saveOrUpdateProduct(Product product);

    void deleteProductById(String id);
}
