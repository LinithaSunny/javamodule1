package userdefinedobjects;

import java.util.Objects;

public class Employee extends Person implements Comparable{
	
	private long empid;
	private String deptno;
	private double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(long empid, String deptno, double salary) {
		super();
		this.empid = empid;
		this.deptno = deptno;
		this.salary = salary;
	}

	public long getEmpid() {
		return empid;
	}

	public void setEmpid(long empid) {
		this.empid = empid;
	}

	public String getDeptno() {
		return deptno;
	}

	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(String name, String gender, int age, long empid, String deptno, double salary) {
		super(name, gender, age);
		this.empid = empid;
		this.deptno = deptno;
		this.salary = salary;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", deptno=" + deptno + ", salary=" + salary + ", getName()=" + getName()
				+ ", getGender()=" + getGender() + ", getAge()=" + getAge() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(deptno, empid, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(deptno, other.deptno) && empid == other.empid
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	@Override
	public int compareTo(Object o) {
		Employee ref = null;
		if(o != null)
		{
			ref  = (Employee) o;
		}
		if(this.empid < ref.getEmpid())
				return -1;
		else if(this.empid > ref.getEmpid())
				return 1;
		else
			
			return 0;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		
//				Employee ref = null;
//				if(obj != null)
//					ref = (Employee) obj;
//				
//				if( this.empid==ref.empid &&
//						this.getName().equals(ref.getName()) &&
//						this.deptno==ref.deptno)
//						return true;
//				else
//						return false;
//				
//	}
	
	
	
	

}
