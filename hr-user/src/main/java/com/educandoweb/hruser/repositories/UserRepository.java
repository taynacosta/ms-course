package com.educandoweb.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.hruser.entites.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
}
