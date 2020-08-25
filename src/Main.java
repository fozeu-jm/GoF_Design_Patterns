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
import com.kwd.structural.adapter.RoundHole;
import com.kwd.structural.adapter.SquaredPegsAdapter;
import com.kwd.structural.adapter.UsaPlug;
import com.kwd.structural.bridge.Tv;
import com.kwd.structural.bridge.UniversalRemote;
import com.kwd.structural.chainsofresponsibility.ItProjectChainFactory;
import com.kwd.structural.chainsofresponsibility.MOE;
import com.kwd.structural.command.BankAccount;
import com.kwd.structural.command.BankAccountCommand;
import com.kwd.structural.command.BankAccountCommand.Action;
import com.kwd.structural.composite.Employee;
import com.kwd.structural.proxy.Drivable;
import com.kwd.structural.proxy.Driver;
import com.kwd.structural.proxy.VehicleProxy;

public class Main {

	public static void main(String[] args) {
		
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

	public static void SingletonPattern() {
		Singleton single = Singleton.getInstance();
		Singleton single2 = Singleton.getInstance();

		single.setValue(15);
		single2.setValue(856);
		System.out.println(single.getValue() + " | " + single2.getValue());
	}

	public static void AdapterPatter() {
		RoundHole hole = new RoundHole(5);
		UsaPlug plug = new UsaPlug(4);

		// UsaPlug is a squared peg so it can't fit in round hole
		SquaredPegsAdapter adapter = new SquaredPegsAdapter(plug);
		System.out.println(hole.fits(adapter) ? "Fits perfectly" : "Does not fit");
	}

	public static void BridgePattern() {
		Tv tv = new Tv();
		UniversalRemote remote = new UniversalRemote(tv);
		remote.power();
		remote.volumeUp();
		tv.printStatus();
	}

	public static void CompositePatter() {
		Employee CEO = new Employee("John", "CEO", 30000);

		Employee headSales = new Employee("Robert", "Head Sales", 20000);

		Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);

		Employee clerk1 = new Employee("Laura", "Marketing", 10000);
		Employee clerk2 = new Employee("Bob", "Marketing", 10000);

		Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
		Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);

		CEO.add(headSales);
		CEO.add(headMarketing);

		headSales.add(salesExecutive1);
		headSales.add(salesExecutive2);

		headMarketing.add(clerk1);
		headMarketing.add(clerk2);

		System.out.println(CEO);
	}

	public static void proxyPatter() {
		Drivable car = new VehicleProxy(new Driver(12));
		car.drive();
	}
	
	public static void chainOfResponsibility() {
		MOE begin = ItProjectChainFactory.getChain();
		begin.handle("Vinted");
	}
	public static void CommandPattern() {
		BankAccount ba = new BankAccount();
		BankAccountCommand bac = new BankAccountCommand(ba);
		System.out.println(ba);
		bac.execute(Action.DEPOSIT, 50000);
		bac.execute(Action.WITHDRAW, 15000);
	}
}
