package com.Jsp.ecommerce.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Jsp.ecommerce.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	boolean existsByEmail(String adminEmail);

	Optional<User> findByEmail(String email);



}
