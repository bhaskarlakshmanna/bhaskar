package com.bhashar.hibernate.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="student")
public class Student implements Serializable
{
	@Id
	private Integer id;
	private String name;
	private String gender;
	private Integer age;
	@Column(name="phoneno")
	private String phone_num;
	public Student()
	{
		
	}
	public Student(Integer id, String name, String gender, Integer age, String phone_num) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phone_num = phone_num;
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
	public String getPhone_num() {
		return phone_num;
	}
	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", phone_num="
				+ phone_num + "]";
	}
	

}
