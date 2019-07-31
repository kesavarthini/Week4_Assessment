package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
@EnableEurekaClient
@RestController
@SpringBootApplication
public class AssessmentAuthenticationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssessmentAuthenticationServiceApplication.class, args);
	}

	@Autowired
	private UserDAO userDao;


	
	@RequestMapping("/callService/{name}&{pwd}")
	public String verify(@PathVariable(value="name") String name,@PathVariable(value="pwd") String pwd) 
	{  
		
		User u=new User();
		u.setUser("Keshu");
		u.setPwd("abc");
		userDao.save(u);
		User u1=new User();
		u1.setUser("Sangeetha");
		u1.setPwd("def");
		userDao.save(u1);
		
		User user=userDao.findUser(name,pwd);
		
	   if(user==null)
	   {
		return "failure";
	   }
	   else 
	   {
	     return "success";
		  
	   }
	   }
	}
	
	

