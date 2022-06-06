package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping("/user")
	public User getUser() {
		return  new User("Maksud Alam", "Rony");
	}
}
