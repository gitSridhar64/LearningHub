package com.learningHub.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learningHub.entity.Users;

public interface UserRepository extends JpaRepository <Users,Integer>{
	//gives positive if present and negative if not
	boolean existsByEmail(String email);
	//to get the users object through email
	Users getByEmail(String email);
}
