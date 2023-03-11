package functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("AndhraPradesh", "TamilNadu", "telangana", "Kerala", "Karnataka");
		Supplier<String> supplier = () -> {
			return new String("hola");

		};
		
		System.out.println(supplier.get());

	}
	
	
}
