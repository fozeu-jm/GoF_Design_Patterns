package com.kwd.structural.flyweight;

import java.util.HashMap;

public class GeometryFactory {
	
	private static final HashMap<String, Geometry> circleMap = new HashMap<String, Geometry>();

	public static Geometry getCircle(String color) {
		Circle circle = (Circle) circleMap.get(color);

		if (circle == null) {
			System.out.println("Creating circle of color : " + color);
			circle = new Circle(color);
			circleMap.put(color, circle);
		}
		return circle;
	}
}
