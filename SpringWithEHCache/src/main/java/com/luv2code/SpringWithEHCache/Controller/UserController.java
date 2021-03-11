package com.luv2code.SpringWithEHCache.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.SpringWithEHCache.Entity.User;
import com.luv2code.SpringWithEHCache.Repository.UserRepository;

@RestController
@RequestMapping("/user")

public class UserController {
	
	@Autowired
	private EntityManager entityManager;
	
	@Autowired
	private UserRepository userRepository;
	
	private Logger LOG = LoggerFactory.getLogger(UserRepository.class);
	
	@GetMapping("/getAllUser")
	@Cacheable(cacheNames = "userList" , key = "'userList'")
	
	public List<User> getAlluser() {
		
		userRepository.save(new User("Sazzad", "sazzad@yahoo.com" , 30));
		userRepository.save(new User("Pritam", "pritam@gmail.com" , 20));
		userRepository.save(new User("Joy", "joy@yahoo.com" , 35));
		
		/* List<User> list = new ArrayList<User>();
		for(User user : list) {
			userRepository.delete(user);
		} */
		
		LOG.info("Returing user list.");
		return userRepository.findAll();
		
	}
	 
}
