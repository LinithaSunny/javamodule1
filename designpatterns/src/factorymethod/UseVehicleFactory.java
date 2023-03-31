package factorymethod;

public class UseVehicleFactory {
	
	public static void main(String[] args) {
		Vehicle seltos = VehicleFactory.newInstance("Seltos");
		seltos.honk();
		
		Vehicle suzuki = VehicleFactory.newInstance("XCross");
		suzuki.move();
				
	}

}
