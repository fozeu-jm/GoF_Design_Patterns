package com.kwd.builder;

public class FerrariCarBuilder implements CarBuilder {
	Car car = new Car();

	public FerrariCarBuilder() {
	}
	
	@Override
	public void buildRoof() {
		this.car.setRoof("Retractable roof");
	}

	@Override
	public void buildWheels() {
		this.car.setWheels("Stylish Wheels");
	}

	@Override
	public void buildWindows() {
		this.car.setWindows("Tinted windows");
	}

	@Override
	public void buildEngine() {
		this.car.setEngine("Diesel Engine");
	}

	@Override
	public void buildDoors() {
		this.car.setDoors("Suicide Doors");
	}
	
	@Override
	public Car getCar() {
		return this.car;
	}
}
