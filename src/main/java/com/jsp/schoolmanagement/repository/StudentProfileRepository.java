package com.jsp.schoolmanagement.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.schoolmanagement.entity.StudentProfileEntity;

public interface StudentProfileRepository extends JpaRepository<StudentProfileEntity, Long> {
	
}
