package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController   // combination of @controller + @responseBody (xml or json object return)
public class HelloWorldController {
  
	//Get HTTP 
	@GetMapping("/hello")
	public String helloWorld() {
		return "hellow world!";
	}
}
