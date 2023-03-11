package userdefinedobjects;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.Iterator;



public class TestEmpHashSet {
	
	public static void main(String[] args) {
		
		HashSet<Employee> empSet = new HashSet<Employee>();	
		
		Employee emp1 = new Employee("John doe","male",24,101,"research",40000);
		Employee emp2 = new Employee("Jon doe","female",34,102,"accounting",30000);
		Employee emp3 = new Employee("Jo doe","male",28,103,"sales",40000);
		Employee emp4 = new Employee("Joh doe","male",30,104,"research",50000);
		Employee emp5 = new Employee("Jn doe","female",26,105,"accounting",30000);
		
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(emp4);
		empSet.add(emp5);
		
		System.out.println(empSet.size());
		
	}

}
