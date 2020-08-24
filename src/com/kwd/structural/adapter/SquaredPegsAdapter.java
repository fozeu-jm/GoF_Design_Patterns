package com.kwd.structural.adapter;

public class SquaredPegsAdapter implements RoundedPegs {
	SquaredPegs peg;

	public SquaredPegsAdapter(SquaredPegs peg) {
		this.peg = peg;
	}

	@Override
	public double getRadius() {
		double result;
		// Calculate a minimum circle radius, which can fit this peg.
		result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
		return result;
	}
}
