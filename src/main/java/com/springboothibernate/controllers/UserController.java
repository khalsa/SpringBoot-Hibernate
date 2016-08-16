package com.springboothibernate.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.springboothibernate.model.User;

import com.springboothibernate.dao.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;

	@RequestMapping(value = "/ping", method = RequestMethod.GET)
	public String ping(){
		return "Ping Service is Up.";
	}
	
	@RequestMapping(value = "/getUsers", method = RequestMethod.GET)
	public List<User> getUsers(){
		return userRepository.findAll();
	}
}
