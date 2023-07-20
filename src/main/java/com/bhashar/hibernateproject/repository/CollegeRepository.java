package com.bhashar.hibernateproject.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.bhashar.hibernate.entity.College;
import com.bhaskar.hibernateproject.util.EntityManagerFactoryUtil;

public class CollegeRepository 
{
	private EntityManager manager=EntityManagerFactoryUtil.getFactory()
			.createEntityManager();
	public void saveCollege(College college)
	{
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.persist(college);
		transaction.commit();
	}
	public College getColegeById(int id)
	{
		return manager.find(College.class, id);
	}

}
