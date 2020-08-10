package com.github.davisantosr.coursewebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.davisantosr.coursewebservices.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
