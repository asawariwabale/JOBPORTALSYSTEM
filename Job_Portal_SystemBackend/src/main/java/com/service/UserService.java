package com.service;

import java.util.List;

import com.model.User;

public interface  UserService  {
	
	public  User saveUser(User user);

	public  User getUserById(int userId);

	public  List<User> getAllUsers();

	public User updateUser(int userId, User user);

	public void deleteUser(int userId);

}
