package oopsday4.statictest;

public class TestStaticDemo {

	public static void main(String[] args) {
		System.out.println(staticDemo.a);
		staticDemo d = new staticDemo();
		System.out.println(d.a);
		staticDemo d1 = new staticDemo();
		System.out.println(d1.a);
		staticDemo d2 = new staticDemo();
		System.out.println(d2.a);
		
//		d.a = 20;
//		System.out.println(d1.a);
//		d1.a++;
//		System.out.println(d.a);

	}

}
