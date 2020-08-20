package com.mtt.kemeno.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mtt.kemeno.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
