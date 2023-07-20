package com.bhashar.hibernateproject;

import java.util.ArrayList;
import java.util.List;

import com.bhashar.hibernate.entity.College;
import com.bhashar.hibernate.entity.Dept;
import com.bhashar.hibernateproject.repository.CollegeRepository;

public class CollegeApp
{
	public static void main(String[] args)
	{
		College college=new College("sv arts college","517502");
		Dept dept = new Dept("Bsc", "bhaskar", college);
		Dept dept2 = new Dept("Bsc", "bharath", college);
		Dept dept3 = new Dept("chimistry", "Gopi", college);
		Dept dept4 = new Dept("Bsc", "vani", college);
		Dept dept5 = new Dept("Bsc", "mauniemma", college);
		List<Dept> list=new ArrayList<>();
		list.add(dept);
		list.add(dept2);
		list.add(dept3);
		list.add(dept4);
		list.add(dept5);
		college.setDepts(list);
		CollegeRepository repo=new CollegeRepository();
//		repo.saveCollege(college);
		College college2 = repo.getColegeById(1);
		List<Dept> depts=college2.getDepts();
		for(Dept d:depts)
		{
			System.out.println(d.getCollege());
		}
		
		
	}
}
