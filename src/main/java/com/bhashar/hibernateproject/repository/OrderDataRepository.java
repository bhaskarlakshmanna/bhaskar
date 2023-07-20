package com.bhashar.hibernateproject.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.bhashar.hibernate.entity.OrderData;

public class OrderDataRepository 
{
	private EntityManager getEntityManager()
	{
		return Persistence.createEntityManagerFactory("bhaskar").createEntityManager();
	}
	public String saveOrderdata(OrderData order)
	{
		EntityManager manager=getEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.persist(order);
		transaction.commit();
		return "data saved";
	}
	public String updateOrder(OrderData data)
	{
		EntityManager manager=getEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.merge(data);
		transaction.commit();
		return "data updated";
	}
	public String deleteOrder(OrderData data)
	{
		EntityManager manager=getEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.remove(data);
		transaction.commit();
		return "data deleted";
	}
	public String daleteOrderData(int id)
	{
		EntityManager manager=getEntityManager();
		OrderData data=manager.find(OrderData.class, id);
		EntityTransaction transaction=manager.getTransaction();
		if(data!=null)
		{
		   transaction.begin();
		   manager.remove(data);
		   transaction.commit();
		return "data removed by id";
		}
		else
		{
			return "no orderdata is found to delete";
		}
		
	}
	public OrderData getOrderById(int id)
	{
		EntityManager manager=getEntityManager();
		return manager.find(OrderData.class, id);
	}
	public List getAllData()
	{
		EntityManager manager=getEntityManager();
		Query query = manager.createQuery("from OrderData data");
		List list= query.getResultList();
		return list;
	}
	public List getproductTypeByProductName(String productname)
	{
		EntityManager manager = getEntityManager();
		String sql="select data.productType from OrderData data where data.productname=?1";
		Query query=manager.createQuery(sql);
		query.setParameter(1, productname);
		List list=query.getResultList();
		return list;
	}
	

}
