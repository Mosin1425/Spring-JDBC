package com.incture.jdbc.dao;

import java.util.List;

import com.incture.jdbc.entity.User;

public interface UserService {
	User saveUser(User user);
	User udpateUser(User user);
	User getById(int id);
	List<User> getAllUsers();
	User deleteById(int id);
}
