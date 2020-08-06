package com.Airline.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Airline.dao.entity.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Long>{

	public User findOneByUsernameAndPassword(String username, String password);
}
