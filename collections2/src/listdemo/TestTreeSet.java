package listdemo;

import java.util.TreeSet;
import java.util.Iterator;

public class TestTreeSet {
	
	public static void main(String[] args) {
		
	    TreeSet<String> bookSet = new TreeSet<>();
		
		bookSet.add("Java in a nutshell");
		bookSet.add("java complete ref");
		bookSet.add("Thinking in java");
		bookSet.add("Java in 21 days");
		bookSet.add("Java for dummys");
		bookSet.add(null);
		System.out.println(bookSet);
		System.out.println(bookSet.size());
		System.out.println(bookSet.contains("java in nutshell"));
		
		
		bookSet.add("Thinking in java");   //will not allow duplicate elements
		System.out.println(bookSet.size());
		
		for(String book: bookSet)
		{
			System.out.println(book);
		}
		
		Iterator<String> iter = bookSet.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
	}
	

}
