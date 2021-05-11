package com.example.poc4.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.poc4.model.User;

public interface UserDao extends JpaRepository<User, Integer> {
	
}
