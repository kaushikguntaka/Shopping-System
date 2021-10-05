package com.gkr.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gkr.springcloud.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

	Product findByName(String name);

}
