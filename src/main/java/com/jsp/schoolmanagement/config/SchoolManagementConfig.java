package com.jsp.schoolmanagement.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class SchoolManagementConfig {
	
	@Bean
	HikariDataSource getDataSource() {
		HikariDataSource dataSource= new HikariDataSource();
		dataSource.setUsername(System.getenv("DB_USER"));
		dataSource.setJdbcUrl(System.getenv("DB_URL"));
		dataSource.setPassword(System.getenv("DB_PASSWORD"));
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return dataSource;
	}
}
