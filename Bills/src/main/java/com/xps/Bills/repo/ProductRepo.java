package com.xps.Bills.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xps.Bills.Pojos.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

	
}
