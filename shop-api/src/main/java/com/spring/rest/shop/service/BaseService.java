package com.spring.rest.shop.service;

import java.util.List;

public interface BaseService <T,ID> {

 T save (T t);

	List<T>findAll();
}
