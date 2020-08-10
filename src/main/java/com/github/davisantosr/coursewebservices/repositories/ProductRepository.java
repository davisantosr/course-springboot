package com.github.davisantosr.coursewebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.davisantosr.coursewebservices.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
