package com.kwd.builder;

public class Director {
	Builder builder;

	public Director(Builder builder) {
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
