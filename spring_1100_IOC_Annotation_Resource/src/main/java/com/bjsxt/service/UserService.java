package com.bjsxt.service;
import javax.annotation.Resource;


import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;



public class UserService {
	
	private UserDAO userDAO;  
	
	public void init() {
		System.out.println("init");
	}
	
	public void add(User user) {
		userDAO.save(user);
	}
	public UserDAO getUserDAO() {
		return userDAO;
	}
	
	@Resource(name = "u2")
	public void setUserDAO( UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	

	
	public void destroy() {
		System.out.println("destroy");
	}
}
