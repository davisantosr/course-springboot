package com.github.davisantosr.coursewebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.davisantosr.coursewebservices.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
