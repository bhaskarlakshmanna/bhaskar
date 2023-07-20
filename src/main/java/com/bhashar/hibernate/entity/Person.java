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
@Table(name="person") //used to modify table properties

public class Person implements Serializable
{
	

	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		private String name;
		private String gender;
		private Integer age;
		@Column(name="phoneno")   //used to modify column properties
		private String phoneNumb;
		@OneToOne(cascade=CascadeType.ALL)
		private OrderData orderData;
		public Person() {
			super();
		}
		
		public OrderData getOrderData() {
			return orderData;
		}

		public void setOrderData(OrderData orderData) {
			this.orderData = orderData;
		}

		public Person( String name, String gender, Integer age, String phoneNumb) {
			super();
			this.name = name;
			this.gender = gender;
			this.age = age;
			this.phoneNumb = phoneNumb;
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
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		public String getPhoneNumb() {
			return phoneNumb;
		}
		public void setPhoneNumb(String phoneNumb) {
			this.phoneNumb = phoneNumb;
		}

		@Override
		public String toString() {
			return "Person [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", phoneNumb="
					+ phoneNumb + ", orderData=" + orderData + "]";
		}
		
		
	

}
