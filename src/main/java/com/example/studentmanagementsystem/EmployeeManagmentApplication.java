package com.example.studentmanagementsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.studentmanagementsystem.dao.EmployeeRepository;


@SpringBootApplication
public class EmployeeManagmentApplication {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagmentApplication.class, args);
	}

	
}
