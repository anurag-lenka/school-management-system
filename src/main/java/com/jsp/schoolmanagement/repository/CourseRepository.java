package com.jsp.schoolmanagement.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.schoolmanagement.entity.CourseEntity;

public interface CourseRepository extends JpaRepository<CourseEntity, Long> {
	
}
