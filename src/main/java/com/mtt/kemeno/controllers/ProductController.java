package com.mtt.kemeno.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mtt.kemeno.models.Product;
import com.mtt.kemeno.repositories.ProductRepository;
@RestController
public class ProductController {
	private ProductRepository repository = null;
	
	public ProductController(ProductRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/products")
	List<Product> all() {
	    return repository.findAll();
	}
}
