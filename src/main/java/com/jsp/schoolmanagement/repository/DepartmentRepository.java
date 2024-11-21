package com.jsp.schoolmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.schoolmanagement.entity.DepartmentEntity;
public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Long> {
	
}