package com.kwd.abstractfactory;

public class RoundedSquare implements Shape {

	@Override
	public void draw() {
		System.out.println("Nice rounded square with border-radius of 5px");
	}

}
