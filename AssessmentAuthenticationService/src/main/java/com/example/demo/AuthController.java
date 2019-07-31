//package com.example.demo;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//public class AuthController {
//	@Autowired
//	private UserDAO userDao;
//
//
//	
//	@RequestMapping("/callService")
//	public String verify( )
//	{  
//		User u=new User();
//		u.setUser("Keshu");
//		u.setPwd("abc");
//		userDao.save(u);
//		
//		return "enroll.jsp";
//	}
//}