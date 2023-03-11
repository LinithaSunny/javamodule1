package oopsday3;

public class Output {

	public static void main(String[] args) {
		mathIface obj = new Calc2();
		int result = obj.factorial(50);
		System.out.println("factorial= "+result);

	}

}
