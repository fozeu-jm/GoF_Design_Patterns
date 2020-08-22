package com.kwd.builder;

public class FerrariCarBuilder implements Builder {
	Car car;

	public FerrariCarBuilder() {
		this.car = new Car();
	}
	
	@Override
	public void buildRoof() {
		this.car.setDoors("Retractable roof");
	}

	@Override
	public void buildWheels() {
		this.car.setWheels("Stylish Wheels");
	}

	@Override
	public void buildWindows() {
		this.car.setWheels("Tinted windows");
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
