package com.kwd.builder;

public class Car implements CarPlan {
	private String doors;
	private String roof;
	private String wheels;
	private String windows;
	private String engine;

	@Override
	public void setRoof(String roof) {
		this.roof = roof;
	}

	@Override
	public void setWheels(String wheels) {
		this.wheels = wheels;
	}

	@Override
	public void setWindows(String windows) {
		this.windows = windows;
	}

	@Override
	public void setEngine(String engine) {
		this.engine = engine;
	}

	@Override
	public void setDoors(String doors) {
		this.doors = doors;
	}

	@Override
	public String toString() {
		return "Car [doors=" + doors + ", roof=" + roof + ", wheels=" + wheels + ", windows=" + windows + ", engine="
				+ engine + "]";
	}
}
