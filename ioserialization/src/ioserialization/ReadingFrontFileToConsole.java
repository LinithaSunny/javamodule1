package ioserialization;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class ReadingFrontFileToConsole {

	public static void main(String[] args) throws IOException {

		FileReader reader = new FileReader("D:\\ustcore\\ioserialization\\src\\ioserialization\\KeyboardToFile.java");
		BufferedReader buffer = new BufferedReader(reader);

		String data = buffer.readLine();
		while (data != null) {
			System.out.println(data);
			data = buffer.readLine();
		}
		
		reader.close();
		buffer.close();

	}

}
