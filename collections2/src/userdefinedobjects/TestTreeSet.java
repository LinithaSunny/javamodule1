package userdefinedobjects;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;



public class TestTreeSet {
	
	public static void main(String[] args) {
		
		TreeSet<Employee> empTreeSet = new TreeSet<Employee>();	
		
		Employee emp1 = new Employee("John doe","male",24,101,"research",40000);
		Employee emp2 = new Employee("Jon doe","female",34,102,"accounting",30000);
		Employee emp3 = new Employee("Jo doe","male",28,103,"sales",40000);
		Employee emp4 = new Employee("Joh doe","male",30,104,"research",50000);
		Employee emp5 = new Employee("Jn doe","female",26,105,"accounting",30000);
		
		empTreeSet.add(emp1);
		empTreeSet.add(emp2);
		empTreeSet.add(emp3);
		empTreeSet.add(emp4);
		empTreeSet.add(emp5);
		
		System.out.println(empTreeSet);
		
	}

}
