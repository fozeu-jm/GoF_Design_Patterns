import com.kwd.builder.Car;
import com.kwd.builder.Director;
import com.kwd.builder.FerrariCarBuilder;
import com.kwd.factory.Point;

public class Main {

	public static void main(String[] args) {
		// builder design pattern demo
		Main.builderPattern();
		
		// factory method design pattern demo
		Main.factoryMethod();

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

}
