import com.kwd.builder.Car;
import com.kwd.builder.Director;
import com.kwd.builder.FerrariCarBuilder;

public class Main {

	public static void main(String[] args) {
		FerrariCarBuilder ferraribuilder = new FerrariCarBuilder();

		Director director = new Director(ferraribuilder);

		director.constructCar();

		Car car = director.getCar();

		System.out.println(car);
	}

}
