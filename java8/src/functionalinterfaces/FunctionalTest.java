package functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionalTest {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("AndhraPradesh", "TamilNadu", "telangana", "Kerala", "Karnataka");
		
		Function<String, Integer> f = (str) -> {
			return str.length();

		};
		
		Function<String, String> f1 = (str) -> {
			return str.toUpperCase();

		};
		Function<String, String> f2 = (str) -> {
			return str.toLowerCase();

		};


//		for (String str : strings) {
//			System.out.println(f.apply(str));
//
//		}
//		System.out.println(f.apply("buenos dias"));
		printLength(strings,f);
		printUppercase(strings,f1);
		printLowercase(strings,f2);
		

	}

	public static void printLength(List<String> strings, Function<String, Integer> fRef) {
		for (String str : strings) {
			System.out.println(fRef.apply(str));

		}
		
		
		//uppercase

		Function<String, String> u = (str) -> {
			return str.toUpperCase();

		};

		for (String str : strings) {
			System.out.println(u.apply(str));
		}

		}
		public static void printUppercase(List<String> strings, Function<String, String> uP) {
			for (String str : strings) {
				System.out.println(uP.apply(str));

			}
			
			Function<String, String> l = (str) -> {
				return str.toUpperCase();

			};

			for (String str : strings) {
				System.out.println(l.apply(str));
			}

			}
			public static void printLowercase(List<String> strings, Function<String, String> lP) {
				for (String str : strings) {
					System.out.println(lP.apply(str));

				}
			

	}
}
