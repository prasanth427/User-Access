package com.Pratice.Helloworld.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.Pratice.Helloworld.Students.Students;

@Component
public class StudentService {

	private static List<Students> students=new ArrayList<>();
	
	static {
		students.add(new Students(101,"Prasanth"));
		students.add(new Students(102,"Prakash"));
		students.add(new Students(103,"Mahesh"));
		
	}
	
	public List<Students>findAll() {
		return students;
	}

	
}
