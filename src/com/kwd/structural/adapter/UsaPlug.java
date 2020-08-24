package com.kwd.structural.adapter;

public class UsaPlug implements SquaredPegs {
	private double width;

	public UsaPlug(double width) {
		this.width = width;
	}

	@Override
	public double getWidth() {
		return width;
	}

	@Override
	public double getSquare() {
		return Math.pow(this.width, 2);
	}
}
