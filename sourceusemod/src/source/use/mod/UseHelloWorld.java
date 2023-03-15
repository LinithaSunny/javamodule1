package source.use.mod;
import source.mod.HelloWorld;

public class UseHelloWorld {
	
	public static void main(String[] args) {
		
		var x = "lin";
		var y = 20.35;
		var z = 'c';
		
		try {
			HelloWorld world = new HelloWorld();
			world.message();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}

