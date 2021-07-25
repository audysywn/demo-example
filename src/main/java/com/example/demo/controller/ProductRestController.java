package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.ProductDTO;
import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import com.example.demo.utils.ObjectMapperUtils;

@RestController
@RequestMapping("/products")
public class ProductRestController {

	@Autowired
    private ProductService productService;
	
	@GetMapping(value = "/")
    public List<ProductDTO> getAllStudents() {
        return ObjectMapperUtils.mapAll(productService.findAll(), ProductDTO.class);
    }

    @GetMapping(value = "/byProductCode/{productCode}")
    public ProductDTO getProductByProductCode(@PathVariable("productCode") String productCode) {
        return ObjectMapperUtils.map(productService.findByProductCode(productCode), ProductDTO.class);
    }

    @GetMapping(value = "/orderByRating")
    public List<ProductDTO> findAllByOrderByRatingDesc() {
        return ObjectMapperUtils.mapAll(productService.findAllByOrderByRatingDesc(), ProductDTO.class);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<?> saveOrUpdateStudent(@RequestBody ProductDTO productDTO) {
    	productService.saveOrUpdateProduct(ObjectMapperUtils.map(productDTO, Product.class));
        return new ResponseEntity<Object>("Product added successfully", HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{productCode}")
    public ResponseEntity<?> deleteProductById(@PathVariable String productCode) {
    	productService.deleteProductById(productService.findByProductCode(productCode).getId());
        return new ResponseEntity<Object>("Product deleted successfully", HttpStatus.OK);
    }

}
