package com.kwd.structural.proxy;

public class Vehicle implements Drivable {
	Driver driver;

	public Vehicle(Driver p_driver) {
		this.driver = p_driver;
	}

	public Driver getDriver() {
		return driver;
	}

	@Override
	public void drive() {
		System.out.println("Car being driven by a driver of " + driver.getAge() + " years old.");
	}
}
