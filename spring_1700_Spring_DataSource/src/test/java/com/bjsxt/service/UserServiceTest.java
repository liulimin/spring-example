package com.bjsxt.service;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bjsxt.model.User;

//Dependency Injection
//Inverse of Control
public class UserServiceTest {

	@Test 
	public void testAdd() throws Exception {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		UserService service = (UserService)ctx.getBean("userService");
		System.out.println(service.getClass());
		
		User user = new User();
		user.setName("llm");
		service.add(user);
		
		ctx.destroy();
		
	}

}
