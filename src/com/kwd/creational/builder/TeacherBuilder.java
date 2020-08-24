package com.kwd.creational.builder;

public class TeacherBuilder {
	Info teacher;

	public TeacherBuilder(Info teach) {
		this.teacher = teach;
	}

	public TeacherBuilder buildFirstName(String firstN) {
		this.teacher.setFirstName(firstN);
		// this makes a fluent interface for piece-wise building of an object
		return this;
	}

	public TeacherBuilder buildLastName(String lastN) {
		this.teacher.setLastName(lastN);
		// this makes a fluent interface for piece-wise building of an object
		return this;
	}

	public TeacherBuilder buildAge(int age) {
		this.teacher.setAge(age);
		// this makes a fluent interface for piece-wise building of an object
		return this;
	}

	public Info getInstance() {
		return this.teacher;
	}
}
