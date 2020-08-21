package com.spring.rest.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rest.shop.entity.Product;
import com.spring.rest.shop.repo.ProductRepo;

@Service
public class ProductServiceImpli implements ProductService {

	@Autowired
	private ProductRepo repo;


	@Override
	public List<Product> findAll() {
		return repo.findAll();
	}

	@Override
	public void deleteById(int id) {
		repo.deleteById(id);
	}

	@Override
	public Product save(Product t) {
		return repo.save(t);
	}

	
	
	
}
