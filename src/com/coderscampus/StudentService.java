package com.coderscampus;

import java.io.IOException;
import java.util.Arrays;

public class StudentService {

	public Student createStudent(String[] stringInput) {
		Student student = new Student();
		student.setStudentId(Integer.parseInt(stringInput[0]));
		student.setStudentName(stringInput[1]);
		student.setCourse(stringInput[2]);
		student.setGrade(Integer.parseInt(stringInput[3]));
		return student;
	}

	public Student sortCourse1() throws IOException {
		DataReader students = new DataReader();
		Arrays.sort(students.readData());
		System.out.println("----");
		for (Student student : students.readData()) {
			System.out.println(student.getCourse());
			return student;
		}
		return null;
	}
	
	
	
}
