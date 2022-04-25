package com.Pratice.Helloworld.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.RestController;

import com.Pratice.Helloworld.Students.Students;
import com.Pratice.Helloworld.service.StudentService;



@RestController
public class HelloController {
	
	@Autowired
	StudentService service;

	@GetMapping("/H" )
	
	public String HelloWorld() {
		return "Hello world";
		
	}
	
	@GetMapping("/Students")
	public List<Students> getAll() {
		return service.findAll();
	}
	
}
