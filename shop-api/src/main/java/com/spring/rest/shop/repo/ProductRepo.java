package com.spring.rest.shop.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.rest.shop.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
