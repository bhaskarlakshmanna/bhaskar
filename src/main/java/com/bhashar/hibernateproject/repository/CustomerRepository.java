package com.bhashar.hibernateproject.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.bhashar.hibernate.entity.Customer;
import com.bhaskar.hibernateproject.util.EntityManagerFactoryUtil;

public class CustomerRepository 
{
	private EntityManager manager=EntityManagerFactoryUtil.getFactory().createEntityManager();
	public void saveCustomer(Customer customer)
	{
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.persist(customer);
		transaction.commit();
	}
	public Customer getCustomerById(int id)
	{
		return manager.find(Customer.class, id); 
	}

}
