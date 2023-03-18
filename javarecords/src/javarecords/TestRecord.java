package javarecords;

public class TestRecord {

	public static void main(String[] args) {
		
		
		Person john = new Person("john",25);
		Person sarah = new Person("sarah",30);
		
		System.out.println(john.name());
		System.out.println(sarah.age());

		
		
	}

}
