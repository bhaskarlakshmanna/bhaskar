package com.bhashar.hibernate.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//example of one to many Bi-directional
@Entity
public class College implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String  name;
	private String pincode;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "college")
	List<Dept> depts;
	public College()
	{
		
	}
	
	public College(String name, String pincode) {
		super();
		this.name = name;
		this.pincode = pincode;
		
	}

	public List<Dept> getDepts() {
		return depts;
	}

	public void setDepts(List<Dept> depts) {
		this.depts = depts;
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
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", pincode=" + pincode + ", depts=" + depts + "]";
	}
	

}
