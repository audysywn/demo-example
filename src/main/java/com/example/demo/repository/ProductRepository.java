package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

    Product findByProductCode(String productCode);

    List<Product> findAllByOrderByRatingDesc();
}