package com.kwd.builder;

public class NormalCarBuilder implements Builder {
	Car car;

	public NormalCarBuilder() {
		this.car = new Car();
	}

	@Override
	public void buildRoof() {
		this.car.setDoors("Normal roof");
	}

	@Override
	public void buildWheels() {
		this.car.setWheels("Normal wheels");
	}

	@Override
	public void buildWindows() {
		this.car.setWheels("Transparent windows");
	}

	@Override
	public void buildEngine() {
		this.car.setEngine("Classic Engine");
	}

	@Override
	public void buildDoors() {
		this.car.setDoors("Classic Doors");
	}

	@Override
	public Car getCar() {
		return this.car;
	}

}
