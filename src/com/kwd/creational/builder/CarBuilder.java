package com.kwd.creational.builder;

public interface CarBuilder {
	public void buildRoof();
	public void buildWheels();
	public void buildWindows();
	public void buildEngine();
	public void buildDoors();
	public Car getCar();
}
