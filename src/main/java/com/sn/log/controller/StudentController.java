package com.sn.log.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sn.log.vo.Student;


@RestController
@RequestMapping(value="/student")
public class StudentController {
	
	private static final Logger logger = LoggerFactory.getLogger(StudentController.class);
	
	@GetMapping(value="/{sid}/details")
	public Student getStudentById(@PathVariable int sid) {
		  logger.info("Inside getStudentById sid:" + sid);
		  logger.debug("Debug level -getStudentById");
		  logger.error("Error level - getStudentById");
		  
		return new Student(sid, "Fname-" + sid , "Lname-" + sid);
	}
	
	@PostMapping(value="/save")
	public Student saveStudent(@RequestBody Student student) {
		 logger.info("Inside saveStudent sid:" + student.getSid());
		 logger.info("Inside saveStudent fname:" + student.getfName());
		 logger.info("Inside saveStudent lname:" + student.getlName());
		 logger.info("Inside saveStudent dept:" + student.getDept());
		  logger.debug("Debug level -saveStudent");
		  logger.error("Error level - saveStudent");
		return student;
	}
}
