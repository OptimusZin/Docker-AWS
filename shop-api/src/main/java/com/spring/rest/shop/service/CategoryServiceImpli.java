package com.spring.rest.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rest.shop.entity.Category;
import com.spring.rest.shop.repo.CategoryRepo;

@Service
public class CategoryServiceImpli implements CategoryService {

	@Autowired
	private CategoryRepo repo;

	@Override
	public Category save(Category t) {
		return repo.save(t);
	}

	@Override
	public List<Category> findAll() {
			return repo.findAll();
	}
		
	
	
}
