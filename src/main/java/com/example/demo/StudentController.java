package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	
	@GetMapping("/")
	public String getString() {
		
		return "This is Test for jenkins...";
	}
}
