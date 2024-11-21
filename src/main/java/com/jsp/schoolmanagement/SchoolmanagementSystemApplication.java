package com.jsp.schoolmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {
		DataSourceAutoConfiguration.class
})
public class SchoolmanagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolmanagementSystemApplication.class, args);
	}

}
