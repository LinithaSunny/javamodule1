package oopsday1.setget.constructor;

public class Carfactory {

	public static void main(String[] args) {
		
		Car jack = new Car();
		jack.setColor("red");
		jack.setPrice(3000000);
		jack.setBrand("jeep");
		jack.setModel("wrangler");
		
		System.out.println(jack.getColor());
		System.out.println(jack.getPrice());
		System.out.println(jack.getBrand());
		System.out.println(jack.getModel());
		
		/*
		 * 
		 * Car jack = new Car(); jack.color = "blue"; jack.price = 3000000; jack.brand =
		 * "jeep"; jack.model = "wrangler"; System.out.println(jack.color);
		 * System.out.println(jack.price); System.out.println(jack.brand);
		 * System.out.println(jack.model);
		 */
		System.out.println("\n");

		/*
		 * Car bmw = new Car(); bmw.color = "black"; bmw.price = 5000000; bmw.brand =
		 * "jeep"; bmw.model = "wrangler"; System.out.println(bmw.color);
		 * System.out.println(bmw.price); System.out.println(bmw.brand);
		 * System.out.println(bmw.model);
		 */

		// TODO Auto-generated method stub

	}

}
