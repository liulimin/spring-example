package com.bjsxt.service;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;


@Component("userService")
public class UserService {
	
	private UserDAO userDAO;  
	
	@PostConstruct
	public void init() {
		System.out.println("init");
	}
	
	public void add(User user) {
		userDAO.save(user);
	}
	public UserDAO getUserDAO() {
		return userDAO;
	}
	
	@Resource(name="u")
	public void setUserDAO( UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	

	@PreDestroy
	public void destroy() {
		System.out.println("destroy");
	}
}
