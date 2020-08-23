package com.kwd.creational.prototype;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	private String firstName, LastName;

	public Student(String fName, String lName) {
		this.firstName = fName;
		this.LastName = lName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", LastName=" + LastName + "]";
	}
}
