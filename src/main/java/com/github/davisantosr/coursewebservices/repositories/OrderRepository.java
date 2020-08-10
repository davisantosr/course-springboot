package com.github.davisantosr.coursewebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.davisantosr.coursewebservices.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
