package com.incture.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.incture.jdbc.entity.User;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	@Override
	public User saveUser(User user) {
		jdbcTemplate.update("INSERT INTO USER (id,name,city) VALUES (?,?,?)", user.getId(), user.getName(), user.getCity());
		return user; 
	}

	@Override
	public User udpateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUsers() {
			
		return jdbcTemplate.query("SELECT * FROM USER", (rs,rowNum) ->
		new User(
				rs.getInt("id"),
				rs.getString("name"),
				rs.getString("city")
				));
		
	}

	@Override                                
	public User deleteById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
