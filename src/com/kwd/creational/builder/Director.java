package com.kwd.creational.builder;

public class Director {
	CarBuilder builder;

	public Director(CarBuilder builder) {
		this.builder = builder;
	}
	
	public void constructCar() {
		builder.buildDoors();
		builder.buildEngine();
		builder.buildRoof();
		builder.buildWindows();
		builder.buildWheels();
	}
	
	public Car getCar() {
		return builder.getCar();
	}
}
