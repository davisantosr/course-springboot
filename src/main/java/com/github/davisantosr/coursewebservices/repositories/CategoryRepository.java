package com.github.davisantosr.coursewebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.davisantosr.coursewebservices.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
