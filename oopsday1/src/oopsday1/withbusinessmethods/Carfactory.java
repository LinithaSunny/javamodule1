package oopsday1.withbusinessmethods;

public class Carfactory {

	public static void main(String[] args) {
		
		Car jack = new Car("black",3000000,"jeep","wrang");
		
		jack.start();
		jack.changeGear(0);
		jack.stop();
		
		System.out.println("\n");
		Car bmw = new Car("black",5000000,"bmw","zee");
		bmw.start();
		bmw.changeGear(1);
		bmw.stop();
		

		// TODO Auto-generated method stub

	}

}
