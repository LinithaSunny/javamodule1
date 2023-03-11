package serialization.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.Iterator;

public class TestEmployee2 {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		FileInputStream fis = new FileInputStream("D:\\ustcore\\ioserialization\\emp.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		Employee ref = (Employee) obj;
		System.out.println(ref);
		
		
	}

}

