package com.kwd.structural.proxy;

public class VehicleProxy implements Drivable {
	Vehicle vehicle;

	public VehicleProxy(Driver p_driver) {
		this.vehicle = new Vehicle(p_driver);
	}

	@Override
	public void drive() {
		if (vehicle.getDriver().getAge() >= 16)
			vehicle.drive();
		else
			System.out.println("Driver does not have legal age to drive car");
	}

}
