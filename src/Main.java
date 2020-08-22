import com.kwd.builder.Director;
import com.kwd.builder.FerrariCarBuilder;

public class Main {

	public static void main(String[] args) {
		FerrariCarBuilder ferraribuilder = new FerrariCarBuilder();
		
		Director director = new Director(ferraribuilder);
		director.constructCar();
		
		System.out.println(director.getCar());
	}
	
}
