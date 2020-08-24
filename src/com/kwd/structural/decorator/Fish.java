package com.kwd.structural.decorator;

public class Fish implements LivingThing {

	@Override
	public void move() {
		System.out.println("I swim majestically");
	}

	@Override
	public void breathing() {
		System.out.println("I breath with my gills");
	}

	@Override
	public void run() {
		System.out.println("Swim faster");
	}

}
