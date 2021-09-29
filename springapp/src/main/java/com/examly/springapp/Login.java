package com.examly.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {
	@Autowired
	UserRepository repo;
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public User home(@RequestBody User user) {
		String email = user.getEmail();
		if(repo.findByEmail(email) == null) {
			repo.save(user);
			return user;
		}
		else {
			return null;
		}
	}
}
