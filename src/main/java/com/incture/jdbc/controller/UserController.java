package com.incture.jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.incture.jdbc.dao.UserService;
import com.incture.jdbc.entity.User;

@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	private UserService userService ;
	
	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
	@GetMapping("/getAll")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
}
