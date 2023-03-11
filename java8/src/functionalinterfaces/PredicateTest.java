package functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {
	
	public static void main(String[] args) {
		
		List<String> strings = Arrays.asList("AndhraPradesh", "TamilNadu", "telangana", "Kerala", "Karnataka");
		
		Predicate<String> p = (String str)->
		{
			return str.length() >10;
			
		};
		
		System.out.println(p.test("heyy!!!"));
		
//		for (String str : strings) 
//		System.out.println(p.test(str));
		desiredLength(strings,p);
			
		
		
		
	}

	public static void desiredLength(List<String> strings, Predicate<String> p1) {
		for (String str : strings) 
	    System.out.println(p1.test(str));
		
	

}
}
