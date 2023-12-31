package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StudentPrjApplication {

	@GetMapping
	public String getMessage() {
		return "Hello World";
	}
	public static void main(String[] args) {
		SpringApplication.run(StudentPrjApplication.class, args);
	}

}
