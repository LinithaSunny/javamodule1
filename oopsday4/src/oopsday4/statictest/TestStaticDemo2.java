package oopsday4.statictest;

public class TestStaticDemo2 {
	int a = 10;
	
	public static void main(String[] args) {
		staticDemo2 d1 = new staticDemo2();
		
		d1.method();
		staticDemo2.method();
	}

}
