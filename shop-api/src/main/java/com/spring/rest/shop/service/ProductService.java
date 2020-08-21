package com.spring.rest.shop.service;

import com.spring.rest.shop.entity.Product;

public interface ProductService extends BaseService<Product, Integer> {

	 public void deleteById(int id);

	
	
}
