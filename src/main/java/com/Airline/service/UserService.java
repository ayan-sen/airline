package com.Airline.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Airline.dao.entity.User;
import com.Airline.dao.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public void save(User user) {
		userRepository.save(user);
	}
	
	public User getUser(Long id) {
		return userRepository.findById(id).get();
	}
}
