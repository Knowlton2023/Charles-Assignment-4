package com.coderscampus;

import java.io.IOException;

public class StudentApplication {

	public static void main(String[] args) throws IOException {
		StudentService student = new StudentService();
		System.out.println(student.sortCourse1());

	}

}
