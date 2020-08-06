package com.Airline.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Airline.dao.entity.User;

public interface UserRepository  extends JpaRepository<User, Long>{

}
