package com.bhashar.hibernateproject.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.bhashar.hibernate.entity.OrderData;
import com.bhashar.hibernate.entity.Person;

public class PersonRepository 
{
	private EntityManager getEntityManager()
	{
		return Persistence.createEntityManagerFactory("bhaskar")
				.createEntityManager();
	}
	public String savePerson(Person person,OrderData orderdata)
	{
//		EntityManagerFactory factory =
//				Persistence.createEntityManagerFactory("bhaskar");
//		EntityManager manager=factory.createEntityManager();
		EntityManager manager=getEntityManager();
		EntityTransaction transcation=manager.getTransaction();
		transcation.begin();
		manager.persist(person);
		manager.persist(orderdata);
		transcation.commit();
		return "Data saved";
	}
	public String updatePerson(Person person)
	{
//		EntityManagerFactory factory =
//				Persistence.createEntityManagerFactory("bhaskar");
//		EntityManager manager=factory.createEntityManager();
		EntityManager manager=getEntityManager();
		EntityTransaction transcation=manager.getTransaction();
		transcation.begin();
		manager.merge(person);
		transcation.commit();
		return "Data updated";
	}
	public String deletePerson(int id)
	{
//		EntityManagerFactory factory =
//				Persistence.createEntityManagerFactory("bhaskar");
//		EntityManager manager=factory.createEntityManager();
		EntityManager manager=getEntityManager();
		Person person=manager.find(Person.class, id);
		EntityTransaction transcation=manager.getTransaction();
		if(person!=null) {
		transcation.begin();
		manager.remove(person);
		transcation.commit();
		
		return "Data deleted";
		}
		else {
			return "no data found to delete";
		}
	}
	public Person getPersonById(int id)
	{
		EntityManager manager = getEntityManager();
		
		return manager.find(Person.class, id);
		
	}
	public List getAllData()
	{
		EntityManager manager=getEntityManager();
		Query query = manager.createQuery("FROM Person p");
		List list =query.getResultList();
		return list;
	}
	public List getPhonenumberByName(String name)
	{
		EntityManager manager = getEntityManager();
		String sql="select p.phoneNumb from Person p where p.name=?1";
		Query query=manager.createQuery(sql);
		query.setParameter(1, name);
		List list=query.getResultList();
		return list;
	}
	public  List personDataByPersonNameAndAge(String name,int age)
	{
		EntityManager manager=getEntityManager();
		String sql=" from Person p where p.name=?1 and p.age=?2";
		Query query=manager.createQuery(sql);
		query.setParameter(1, name);
		query.setParameter(2, age);
		List list=query.getResultList();
		return list;
	}

}
