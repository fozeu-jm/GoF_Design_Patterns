package com.kwd.builder;

public class NormalCarBuilder implements CarBuilder {
	Car car= new Car();

	public NormalCarBuilder() {
	}

	@Override
	public void buildRoof() {
		this.car.setRoof("Normal roof");
	}

	@Override
	public void buildWheels() {
		this.car.setWheels("Normal wheels");
	}

	@Override
	public void buildWindows() {
		this.car.setWindows("Transparent windows");
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
