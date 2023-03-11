package oopsday4.polymorphism;

public class TestShapes extends Shape{

	public static void main(String[] args) {
		
	    Shape s = new Square(5);
		double result = s.area();
		System.out.println(result);
		
		 s = new Circle(5);
		 result = s.area();
		System.out.println(result);
		
	}

}
