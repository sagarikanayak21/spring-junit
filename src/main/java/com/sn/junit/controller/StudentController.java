package com.sn.junit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sn.junit.service.StudentServiceI;
import com.sn.junit.vo.Student;


@RestController
@RequestMapping(value="/student")
public class StudentController {
	
	private static final Logger logger = LoggerFactory.getLogger(StudentController.class);
	
	@Autowired
	public StudentServiceI studentService;
	
	@GetMapping(value="/{sid}/details")
	public Student getStudentById(@PathVariable int sid) {
		  logger.info("Inside getStudentById sid:" + sid);
		  logger.debug("Debug level -getStudentById");
		  logger.error("Error level - getStudentById");
		  
		  Student std = studentService.getStudentById(sid);
		  return std;
//		  return studentService.getStudentById(sid);
		
	}
	
	@PostMapping(value="/save")
	public Student saveStudent(@RequestBody Student student) {
		 logger.info("Inside saveStudent sid:" + student.getSid());
		 Student std = studentService.saveStudent(student);
		 return std;
		//return saveStudent(student);
	}
}
