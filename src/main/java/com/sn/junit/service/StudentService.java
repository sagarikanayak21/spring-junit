package com.sn.junit.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.sn.junit.vo.Student;

@Service
public class StudentService implements StudentServiceI {
	private static final Logger logger = LoggerFactory.getLogger(StudentService.class);

	@Override
	public Student getStudentById(int sid) {
		return new Student(sid, "Fname-" + sid , "Lname-" + sid);
	}

	@Override
	public Student saveStudent(Student student) {
		student.setDept("20");
		student.setCourse("MCA");
		return student;
	}

}
