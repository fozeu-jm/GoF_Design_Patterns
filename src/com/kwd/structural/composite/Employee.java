package com.kwd.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Identity {
	private String name;
	private String dept;
	private int salary;
	private List<Identity> subordinates;

	public Employee(String name, String dept, int sal) {
		this.name = name;
		this.dept = dept;
		this.salary = sal;
		subordinates = new ArrayList<Identity>();
	}

	@Override
	public void add(Identity e) {
		subordinates.add(e);
	}

	@Override
	public void remove(Identity e) {
		subordinates.remove(e);
	}

	@Override
	public List<Identity> getSubordinates() {
		return subordinates;
	}

	@Override
	public String toString() {
		String n = "\n==========Subordinates=========";
		for(Identity sub : subordinates) {
			n += "\n" + sub.toString();
		}
		return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary+"]"+n);
	}

	

}
