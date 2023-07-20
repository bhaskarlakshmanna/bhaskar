package com.bhashar.hibernate.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="order_data")
public class OrderData implements Serializable
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name="product_name",nullable=false,unique=true)
	private String productname;
	@Column(nullable = false)
	private Integer quantity;
	
	@Column(name="product_type",nullable = false,unique = true)
	private String productType;
	@OneToOne(cascade=CascadeType.ALL)
	private Person person;
	public OrderData() {}
	
	public OrderData( String productname, Integer quantity, String productType) {
		super();
		
		this.productname = productname;
		this.quantity = quantity;
		this.productType = productType;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}

	@Override
	public String toString() {
		return "OrderData [id=" + id + ", productname=" + productname + ", quantity=" + quantity + ", productType="
				+ productType + ", person=" + person + "]";
	}
	
	
}
