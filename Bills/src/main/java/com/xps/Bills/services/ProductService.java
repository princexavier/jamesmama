package com.xps.Bills.services;

import java.util.List;

import com.xps.Bills.Pojos.Product;

public interface ProductService{

	public Product saveProduct(String product);
	public List<Product> getProducts();
}
