import org.apache.commons.lang3.SerializationUtils;

import com.kwd.creational.abstractfactory.AbstractFactory;
import com.kwd.creational.abstractfactory.FactoryProducer;
import com.kwd.creational.abstractfactory.Shape;
import com.kwd.creational.builder.Car;
import com.kwd.creational.builder.Director;
import com.kwd.creational.builder.FerrariCarBuilder;
import com.kwd.creational.factory.Point;
import com.kwd.creational.prototype.Student;
import com.kwd.creational.singleton.Singleton;

public class Main {

	public static void main(String[] args) {
		
		Singleton single = Singleton.getInstance();
		Singleton single2 = Singleton.getInstance();
		
		single.setValue(15);
		single2.setValue(856);
		System.out.println(single.getValue() + " | " + single2.getValue());

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

	public static void PrototypePattern() {
		Student std = new Student("John", "Mayers");
		Student std2 = SerializationUtils.roundtrip(std);
		std2.setFirstName("Evelyne");
		System.out.println(std2);
		System.out.println(std);
	}

}
