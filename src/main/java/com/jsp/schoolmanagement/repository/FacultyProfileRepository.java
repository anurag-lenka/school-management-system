package com.jsp.schoolmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.schoolmanagement.entity.FacultyProfileEntity;

public interface FacultyProfileRepository extends JpaRepository<FacultyProfileEntity, Long> {
	
}
