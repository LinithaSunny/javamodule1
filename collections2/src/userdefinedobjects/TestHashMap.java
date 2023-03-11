package userdefinedobjects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.HashMap;

public class TestHashMap {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee("John doe","male",24,101,"research",40000);
		Employee emp2 = new Employee("Jon doe","female",34,102,"accounting",30000);
		Employee emp3 = new Employee("Jo doe","male",28,103,"sales",40000);
		Employee emp4 = new Employee("Joh doe","male",30,104,"research",50000);
		Employee emp5 = new Employee("Jn doe","female",26,105,"accounting",30000);
		
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);
		emplist.add(emp4);
		emplist.add(emp5);
		
		
		HashSet<Employee> empSet = new HashSet<Employee>();	
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(emp4);
		empSet.add(emp5);
		

		TreeSet<Employee> empTreeSet = new TreeSet<Employee>();	
		empTreeSet.add(emp1);
		empTreeSet.add(emp2);
		empTreeSet.add(emp3);
		empTreeSet.add(emp4);
		empTreeSet.add(emp5);
		
		HashMap<String,Collection> dataMap = new HashMap<>();
		 dataMap.put("emplist", emplist);
		 dataMap.put("empSet", empSet);
		 dataMap.put("empTreeSet", empTreeSet);
		 System.out.println(dataMap);
		 
		 Collection<Employee> list = dataMap.get("empList");
		 Iterator<Employee> iter = list.iterator();
		 while(iter.hasNext())
		 {
			 System.out.println(iter.next());
		 }
		 
		 Collection<Employee> set = dataMap.get("empSet");
		 iter = set.iterator();
		 while(iter.hasNext())
		 {
			 System.out.println(iter.next());
		 }
		 
		 Collection<Employee> tree= dataMap.get("empTreeSet");
		 iter = tree.iterator();
		 while(iter.hasNext())
		 {
			 System.out.println(iter.next());
		 }
		 
		 
		 
		 
		 
	}

}
