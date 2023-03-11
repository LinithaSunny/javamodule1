package optional;

import java.util.Optional;

public class TestOptional {
	
	public static void main(String[] args) {
		
		String str = null;
		String str1 ="hello";
//		Optional<String> optional = Optional.of(str);
				
		//System.out.println(optional.get());  exception
		Optional<String> optional2 = Optional.ofNullable(str1);
		if(optional2.isPresent())
			System.out.println("value not present"+optional2.get());
		else
			System.out.println("value is present");
		//System.out.println(optional2.get());
		System.out.println("is null"+optional2.orElse("str not initialised"));
	}

}
