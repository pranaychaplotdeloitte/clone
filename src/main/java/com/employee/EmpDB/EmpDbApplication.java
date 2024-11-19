package com.employee.EmpDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.employee.EmpDB")
@EntityScan(basePackages = "com.employee.EmpDB.Entity")
public class EmpDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpDbApplication.class, args);
	}

}
