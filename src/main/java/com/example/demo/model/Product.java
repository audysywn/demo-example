package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class Product {
	@Id
    private String id;
	private String productCode;
	private String productDesc;
	private double productPrice;
	private int rating;
	private boolean availability;
	
	public Product() {
		
	}
	
	public Product(String productCode, String productDesc, double productPrice, int rating, boolean availablity, boolean availability) {
		this.setProductCode(productCode);
		this.setProductDesc(productDesc);
		this.setProductPrice(productPrice);
		this.setRating(rating);
		this.setAvailability(availability);
	}
	
	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	
	@Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", productCode='" + productCode + '\'' +
                ", productDesc=" + productDesc +
                ", productPrice='" + productPrice + '\'' +
                ", availability=" + availability +
                '}';
    }
}
