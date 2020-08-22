import com.kwd.abstractfactory.AbstractFactory;
import com.kwd.abstractfactory.FactoryProducer;
import com.kwd.abstractfactory.Shape;
import com.kwd.builder.Car;
import com.kwd.builder.Director;
import com.kwd.builder.FerrariCarBuilder;
import com.kwd.factory.Point;

public class Main {

	public static void main(String[] args) {
		// builder design pattern demo
		// Main.builderPattern();

		// factory method design pattern demo
		// Main.factoryMethod();

		// Abstract factory design pattern demo
		Main.AbstractFactoryPattern();
	}

	public static void builderPattern() {
		FerrariCarBuilder ferraribuilder = new FerrariCarBuilder();

		Director director = new Director(ferraribuilder);

		director.constructCar();

		Car car = director.getCar();

		System.out.println(car);
	}

	public static void factoryMethod() {
		// use a static method to build the object - factory method
		Point pt = Point.newPolarPoint(2, 3);
		System.out.println(pt);
	}

	public static void AbstractFactoryPattern() {
		// get shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
		// get an object of Shape Rectangle
		Shape shape1 = shapeFactory.getShape("RECTANGLE");
		// call draw method of Shape Rectangle
		shape1.draw();
		// get an object of Shape Square
		Shape shape2 = shapeFactory.getShape("SQUARE");
		// call draw method of Shape Square
		shape2.draw();
		// get shape factory
		AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
		// get an object of Shape Rectangle
		Shape shape3 = shapeFactory1.getShape("RECTANGLE");
		// call draw method of Shape Rectangle
		shape3.draw();
		// get an object of Shape Square
		Shape shape4 = shapeFactory1.getShape("SQUARE");
		// call draw method of Shape Square
		shape4.draw();
	}

}
