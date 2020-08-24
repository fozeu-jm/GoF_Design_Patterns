package com.kwd.structural.decorator;

public class Human implements LivingThing {

	@Override
	public void move() {
		System.out.println("I walk like a human");
	}

	@Override
	public void breathing() {
		System.out.println("I breath with my lungs");
	}

	@Override
	public void run() {
		System.out.println("I run on my two feets");
	}

}
