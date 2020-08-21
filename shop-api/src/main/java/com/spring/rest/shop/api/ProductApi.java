package com.spring.rest.shop.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.shop.entity.Product;
import com.spring.rest.shop.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductApi {

	
	@Autowired
	private ProductService service;
	
	@PostMapping
	public Product save(@RequestBody Product product) {
		return service.save(product);
	}
	
	@PutMapping
	public void update(Product product) {
		save(product);
	}
	
	@GetMapping
	public List<Product> findAll(){
		return service.findAll();
		
	}
	
	@DeleteMapping("{id:\\d+}")
	public void deleteById(@PathVariable int id) {
		service.deleteById(id);
	}
}
