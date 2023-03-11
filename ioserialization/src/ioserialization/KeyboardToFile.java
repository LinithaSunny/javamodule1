package ioserialization;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardToFile {

	public static void main(String[] args) throws IOException {
		System.out.println("Entered main");

		String data = null;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		
		FileWriter writer = new FileWriter("Nammadefile.txt");
		System.out.println("Enter some text");
		data = reader.readLine();
		while (data.equals("quit")) {
			
			writer.write(data);

			data = reader.readLine();

			//System.out.println("you have entered data..." + data);
		}
		writer.flush();
		writer.close();
		reader.close();

		System.out.println("Main exited");
	}

}
