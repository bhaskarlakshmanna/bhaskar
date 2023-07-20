package com.bhashar.hibernateproject;

import com.bhashar.hibernate.entity.OrderData;
import com.bhashar.hibernateproject.repository.OrderDataRepository;

public class OrderdataApp 
{
	public static void main(String args[])
	{
		OrderData data = new OrderData( "whisky", 5, "liquid");
		OrderDataRepository repository=new OrderDataRepository();
		System.out.println(repository.saveOrderdata(data));
	}
}
