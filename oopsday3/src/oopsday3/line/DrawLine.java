package oopsday3.line;
import java.util.Scanner;

public class DrawLine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first coordinates");
		int a = sc.nextInt();
		int b = sc.nextInt();
		Line p1 = new Line(a,b);
		System.out.println("Enter the second coordinates");
		a = sc.nextInt();
		b= sc.nextInt();
		

		
	}

}
