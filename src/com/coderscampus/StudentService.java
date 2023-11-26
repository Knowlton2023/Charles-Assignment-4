package com.coderscampus;

public class StudentService {

	public Student createStudent(String[] stringInput) {
		Student student = new Student();
		student.setStudentId(stringInput[0]);
		student.setStudentName(stringInput[1]);
		student.setCourse(stringInput[2]);
		student.setGrade(stringInput[3]);
		return student;
	}

	
	
}
