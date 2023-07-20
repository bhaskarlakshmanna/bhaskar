package com.bhashar.hibernateproject;

import com.bhashar.hibernate.entity.Student;
import com.bhashar.hibernateproject.repository.StudentRepository;

public class StudentApp 
{
	public static void main(String args[])
	{
		System.out.println("hi bhaskar");
		Student student = new Student(2, "bhaskar", "male", 23, "123456789");
		StudentRepository repository = new StudentRepository();
		System.out.println(repository.saveStudent(student));
	}
}
