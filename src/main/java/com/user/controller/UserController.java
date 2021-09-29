package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.entities.User;
import com.user.exception.UserNotFoundException;
import com.user.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService user;

	
	@GetMapping("user/{id}")
	public User getUser(@PathVariable int id) throws UserNotFoundException  {
		return this.user.getUser(id);
	}
	
	@PostMapping("/users")
	public User addUser(@RequestBody User user) {
		return this.user.addUser(user);
		
	}
	
	@GetMapping("/users/sort")
	public List<User> sortUsers(){
		return this.user.sortUsers();
	}
	
}





