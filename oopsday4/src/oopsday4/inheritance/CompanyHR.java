package oopsday4.inheritance;

public class CompanyHR {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee("John doe","male",24,101,"research",40000);
		System.out.println(emp1);
		
		Employee emp2 = new Employee("Jon doe","female",34,102,"accounting",30000);
		System.out.println(emp2);
		
		Employee emp3 = new Employee("Jo doe","male",28,103,"sales",40000);
		System.out.println(emp3);
		
		Employee emp4 = new Employee("Joh doe","male",30,104,"research",50000);
		System.out.println(emp4);
		
		Employee emp5 = new Employee("Jn doe","female",26,105,"accounting",30000);
		System.out.println(emp5);
	}

}
