package com.kwd.creational.abstractfactory;

public class RoundedRectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Nice rounded rectangle with border-radius of 5px");
	}

}
