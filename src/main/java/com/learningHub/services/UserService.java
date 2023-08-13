package com.learningHub.services;

import com.learningHub.entity.Users;

public interface UserService {
	public String addUser(Users user);
	public String loginUser(String email, String password);
	boolean checkEmail(String email);
	boolean validate(String email, String passwword);
	public String getUserRole(String email);

}
