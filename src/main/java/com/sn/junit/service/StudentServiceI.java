package com.sn.junit.service;

import com.sn.junit.vo.Student;

public interface StudentServiceI {
	public Student getStudentById(int sid);
	public Student saveStudent(Student std);
}
