package listdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {
	
	public static void main(String[] args) {
		
		ArrayList flowers = new ArrayList(); //anything added will be converted to its parent type
		flowers.add(new Integer("1"));
		flowers.add(new java.util.Date());
		flowers.add(new java.util.Scanner(System.in));
		flowers.add(new Double("10.10"));		
		flowers.add("tulips");
		flowers.add("rose");
		flowers.add("lily");
		flowers.add("cosmos");
		flowers.add("jasmine");
		
		//System.out.println("hello".length());
		
		Object obj = flowers.get(3);
		if(obj instanceof Integer) {
				Integer in = (Integer) obj;
				System.out.println(in.MIN_VALUE);
		}
		
		else if(obj instanceof Double)
		{
			Double d = (Double) obj;
			System.out.println(d.MAX_VALUE);
		}
		
		else if(obj instanceof String)
		{
			String str =(String) obj;
			System.out.println(str.toUpperCase());
		}
		
		
//		System.out.println(flowers);
//		System.out.println(flowers.size());
//		System.out.println(flowers.get(2));
//		System.out.println(flowers.contains("lilly"));//case sensitive
//		
//		flowers.add(2, "sunflower");
//		for (Object obj : flowers) {
//			
//				System.out.println(flowers);
//			
//			
//			
//		}	
//		
//				flowers.remove(2);
//				System.out.println(flowers);
//				
//				Iterator iter = flowers.iterator();
//				
//				while(iter.hasNext())
//				{
//					System.out.println(iter.next());
//				}
//				
//				for (int i = 0; i < flowers.size(); i++) {
//					System.out.println(flowers.get(i));
//					
//				}
//				
		}
	}


