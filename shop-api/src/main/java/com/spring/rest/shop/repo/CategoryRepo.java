package com.spring.rest.shop.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.rest.shop.entity.Category;

public interface CategoryRepo extends JpaRepository<Category,Integer> {

}
