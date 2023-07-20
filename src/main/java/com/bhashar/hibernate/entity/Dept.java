package com.bhashar.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Dept 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String HOD;
	@ManyToOne
	@JoinColumn()
	private College college;
	public Dept() {
		// TODO Auto-generated constructor stub
	}
	public Dept(String name, String hOD, College college) {
		super();
		this.name = name;
		HOD = hOD;
		this.college = college;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHOD() {
		return HOD;
	}
	public void setHOD(String hOD) {
		HOD = hOD;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	@Override
	public String toString() {
		return "Dept [id=" + id + ", name=" + name + ", HOD=" + HOD + "]";
	}
	
	
	 

}
