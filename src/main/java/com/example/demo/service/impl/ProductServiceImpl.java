package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
    private ProductRepository productRepository;

	@Override
	public Product findByProductCode(String productCode) {
		return productRepository.findByProductCode(productCode);
	}

	@Override
	public List<Product> findAll() {
		return productRepository.findAll();
	}

	@Override
	public List<Product> findAllByOrderByRatingDesc() {
		return productRepository.findAllByOrderByRatingDesc();
	}

	@Override
	public Product saveOrUpdateProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public void deleteProductById(String id) {
		productRepository.deleteById(id);
	}

}
