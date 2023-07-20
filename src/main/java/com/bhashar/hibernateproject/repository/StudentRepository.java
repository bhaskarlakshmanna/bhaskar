package com.bhashar.hibernateproject.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bhashar.hibernate.entity.Student;

public class StudentRepository 
{
	private EntityManager getEntityManager()
	{
		return Persistence.createEntityManagerFactory("bhaskar").createEntityManager();
	}
	public String saveStudent(Student student)
	{
		EntityManager manager=getEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.persist(student);
		transaction.commit();
		return "data inserted";
	}
	public String updateStudent(Student student)
	{
		EntityManager manager=getEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.merge(student);
		transaction.commit();
		return "data updated";
		
	}
	public String deleteStudent(int id)
	{
		EntityManager manager=getEntityManager();
		Student student=manager.find(Student.class, id);
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.remove(student);
		transaction.commit();
		return "data deleted";
	}

}
