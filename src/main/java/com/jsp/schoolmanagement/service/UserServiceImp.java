package com.jsp.schoolmanagement.service;


import com.jsp.schoolmanagement.entity.UserEntity;
import com.jsp.schoolmanagement.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    private UserRepository userRepository;
    
    @Override
    public Optional<UserEntity> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
    
    @Override
    public void save(UserEntity userEntity) {
        userRepository.save(userEntity);
    }
    
    @Override
	public Optional<UserEntity> findById(Long id) {
		
		return userRepository.findById(id);
	}
    
    
}

