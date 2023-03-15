package oopsday4.composition;

public class CompanyHR {
	
	public static void main(String[] args) {
		
		Address resAdd = new Address("31","Nikhil","Worli","Mumbai",400048);
		Address corrAdd = new Address("40","Nik","bandra","Mumbai",400049);
		
		
		Employee emp1 = new Employee("John doe","male",24,101,"research",40000,resAdd,corrAdd);
		System.out.println(emp1);
		
		Employee emp2 = new Employee("Jon doe","female",34,102,"accounting",30000,resAdd,corrAdd);
		System.out.println(emp2);
		
		Employee emp3 = new Employee("Jo doe","male",28,103,"sales",40000,resAdd,corrAdd);
		System.out.println(emp3);
		
		Employee emp4 = new Employee("Joh doe","male",30,104,"research",50000,resAdd,corrAdd);
		System.out.println(emp4);
		
		Employee emp5 = new Employee("Jn doe","female",26,105,"accounting",30000,resAdd,corrAdd);
		System.out.println(emp5);
	}

}
