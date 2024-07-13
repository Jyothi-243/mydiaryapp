package com.jsp.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.jsp.springboot.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	@Query(value = "select * from users where username=:username LIMIT 1", nativeQuery = true) //named parameter :value
	public User findByUsername( String username);

}
