package com.bhashar.hibernateproject;

import java.util.ArrayList;
import java.util.List;

import com.bhashar.hibernate.entity.BankAccount;
import com.bhashar.hibernate.entity.Customer;
import com.bhashar.hibernate.entity.OrderData;
import com.bhashar.hibernate.entity.Person;
import com.bhashar.hibernateproject.repository.CustomerRepository;
import com.bhashar.hibernateproject.repository.PersonRepository;

public class App 
{
	public static void main(String[] args) {
//		System.out.println("hello world");
//		Person person = new Person(11,"bharath","male",22, "904773476");
//		PersonRepository repository = new PersonRepository();
//		OrderData data=new OrderData("UA lockdown defence", 2, "shoes") ;
//		System.out.println(repository.savePerson(person,data));
		BankAccount account = new BankAccount("canara", "6787032");
		BankAccount account2 = new BankAccount("SBI", "45609813");
		BankAccount account3 = new BankAccount("KOTAK", "531275791");
		BankAccount account4 = new BankAccount("KARANATAKA", "66263732");
		BankAccount account5 = new BankAccount("UNION", "12309");
		List<BankAccount> list=new ArrayList<>();
		list.add(account);
		list.add(account2);
		list.add(account3);
		list.add(account4);
		list.add(account5);
		Customer customer= new Customer("bhaskar","burtuk",list);
		CustomerRepository repo=new CustomerRepository();
//		repo.saveCustomer(customer);
//		Customer customer2=repo.getCustomerById(1);
//		List<BankAccount> accounts=customer2.getAccounts();
//		accounts.forEach(System.out::println);
		System.out.println(repo.getCustomerById(1));
		
	}
}
