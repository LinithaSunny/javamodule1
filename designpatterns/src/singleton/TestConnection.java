package singleton;

public class TestConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Math math = new Math()
		for (int i = 1; i <= 10; i++) {
			Connection con1 = Connection.getConnection();
			Connection con2 = Connection.getConnection();

			if (con1.hashCode() == con2.hashCode()) {
				System.out.println("Connection is singleton");

			} else {
				System.out.println("Connection is not singleton");
			}
		}
	}

}
