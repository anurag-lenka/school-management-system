package com.jsp.schoolmanagement.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.schoolmanagement.entity.UserEntity;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByUsername(String username);
}
