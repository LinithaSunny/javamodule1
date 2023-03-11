package userdefinedobjects;

import java.util.HashMap;

public class FrequencyHashMapTest {
	
	public static void main(String[] args) {
		
		String str = "She sells sea shells on the sea shore ";
		
		String n[] = str.split(" ");
		System.out.println(n);
		int num=n.length;
		System.out.println(num);
		
		HashMap<String,Integer> freq = new HashMap<>();
		
		for (String c : n) {
			
			Integer y = freq.get(c);
			
			if(y == null)
			{
				freq.put(c, 1);
			}
			else
			{
				freq.put(c, y+1);
			}
			
		}
		System.out.println(freq);
		
		
		
	
		
	}
	

}
