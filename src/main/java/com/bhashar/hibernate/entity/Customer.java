package com.bhashar.hibernate.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class Customer implements Serializable
{
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable = false)
    private String name;
	@Column(nullable = false)
    private String address;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	private List<BankAccount> accounts;
	public Customer()
	{
		
	}
	public Customer( String name, String address, List<BankAccount> accounts) {
		super();
		
		this.name = name;
		this.address = address;
		this.accounts = accounts;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<BankAccount> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<BankAccount> accounts) {
		this.accounts = accounts;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", accounts=" + accounts + "]";
	}
	

}
