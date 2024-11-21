package com.jsp.schoolmanagement.service;

import java.util.Optional;

import com.jsp.schoolmanagement.entity.UserEntity;

public interface UserService {
	
	Optional<UserEntity> findByUsername(String username);
	
	void save(UserEntity userEntity);
	
	Optional<UserEntity> findById(Long id);
}
