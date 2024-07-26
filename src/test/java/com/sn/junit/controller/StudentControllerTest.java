package com.sn.junit.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.BDDMockito.given;

import com.sn.junit.service.StudentService;
import com.sn.junit.vo.Student;

@ExtendWith(MockitoExtension.class)
class StudentControllerTest {

	@InjectMocks
	private StudentController studentController;
	
	@Mock
	private StudentService studentService;
	
	@Test
	void getStudentById() {
		Student student = new Student(101, "Sagarika", "Nayak");
		given(studentService.getStudentById(101)).willReturn(student);

		Student std = studentController.getStudentById(101);
		
		assertThat(std).isNotNull();
		assertThat(std.getSid()).isEqualTo(101);
		assertThat(std.getfName()).isEqualTo("Sagarika");
	}
	
	@Test
	void saveStudent() {
		Student student = new Student(101, "Sagarika", "Nayak");
		
		Student st = new Student(102, "Sid", "Patra");
		given(studentService.saveStudent(st)).willReturn(student);
		
		Student std = studentController.saveStudent(st);
	
		assertThat(std).isNotNull();
		assertThat(std.getSid()).isEqualTo(101);
		assertThat(std.getlName()).isEqualTo("Nayak");
	}

}
