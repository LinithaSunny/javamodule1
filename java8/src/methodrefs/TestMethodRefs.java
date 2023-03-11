package methodrefs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

interface Formula{
	public void m1();
}

class Some{
	public static void m2() {
		System.out.println("from m2.....");
	}
}

class Other{
	Other()
	{
		System.out.println("from other constructor");
	}
}
public class TestMethodRefs {
			
	public static void main(String[] args) {
		
		Formula f = Some::m2;  // method reference operator
		f.m1();
		
		
		f = Other::new; //calls the constructor and returns the object of the class to the functional interface
		Other o = new Other();
		
		List<String> list = Arrays.asList("one","two","three");
		list.stream().forEach(System.out::println);
		List<Integer> intList = Arrays.asList(12,32,1323,11);
		Optional<Integer> num = intList.stream().reduce(Math::max);
		System.out.println(num.get());
		
	}

	}
