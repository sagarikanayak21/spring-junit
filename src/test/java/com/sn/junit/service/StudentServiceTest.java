package com.sn.junit.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import com.sn.junit.vo.Student;

@ExtendWith(MockitoExtension.class)
class StudentServiceTest {
	@InjectMocks
	private StudentService studentService;
	
	@Test
	void getStudentById() {
		Student std = studentService.getStudentById(101);
		
		assertThat(std).isNotNull();
		assertThat(std.getSid()).isEqualTo(101);
		assertThat(std.getfName()).isEqualTo("Fname-101");
	}
	
	@Test
	void saveStudent() {
		Student st = new Student(102, "Sid", "Patra");
		
		Student std = studentService.saveStudent(st);
	
		assertThat(std).isNotNull();
		assertThat(std.getSid()).isEqualTo(102);
		assertThat(std.getlName()).isEqualTo("Patra");
		assertThat(std.getDept()).isEqualTo("20");
		assertThat(std.getCourse()).isEqualTo("MCA");
	}
}
