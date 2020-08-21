package com.spring.rest.shop.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.shop.entity.Category;
import com.spring.rest.shop.service.CategoryService;

@RestController
@RequestMapping("/categories")
public class CategoryApi  {

	@Autowired
	private CategoryService service;
	
	
	@GetMapping
	public List<Category> findAll(){
		return service.findAll();
	}
}

