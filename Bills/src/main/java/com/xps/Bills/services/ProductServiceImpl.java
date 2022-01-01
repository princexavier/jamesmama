package com.xps.Bills.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xps.Bills.Pojos.Product;
import com.xps.Bills.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepo productRepo;

	@Override
	public Product saveProduct(String productRequest) {
		Product product =null;
		try {
			ObjectMapper mapper = new ObjectMapper();
			product=mapper.readValue(productRequest, Product.class);
			
		}
		catch(Exception e) {
			
		}
		return productRepo.save(product);
	}

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}
	

 
}
