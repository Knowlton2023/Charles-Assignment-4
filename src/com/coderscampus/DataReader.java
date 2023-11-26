package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {

	public Student[] readData() throws IOException {

		BufferedReader fileReader = null;
		String[] inputs = null;
		StudentService studentService = new StudentService();
		Student[] students = new Student[101];
		String line = "";

		fileReader = new BufferedReader(new FileReader("student-master-list.csv"));
		
		int i = 0;
		while ((line = fileReader.readLine()) != null) {
			// This is where I will read my data into an Array 
			// so that I can compare it later
			inputs = line.split(",");
			students[i] = studentService.createStudent(inputs);
			i++;
		}
		fileReader.close();
		return students;
	}

	
	
}
