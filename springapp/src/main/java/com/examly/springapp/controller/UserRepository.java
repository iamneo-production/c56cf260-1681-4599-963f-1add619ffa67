package com.examly.springapp.controller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.UserModel;


@Repository
public interface UserRepository extends JpaRepository   <UserModel, String>{
	public UserModel findByEmail(String email);
}
