package com.kwd.creational.factory;

public class Point {
	@SuppressWarnings("unused")
	private double x, y;

	private Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public static Point newCartesianPoint(double x, double y) {
		return new Point(x, y);
	}

	public static Point newPolarPoint(double rho, double teta) {
		return new Point(rho * Math.cos(teta), rho * Math.sin(teta));
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
