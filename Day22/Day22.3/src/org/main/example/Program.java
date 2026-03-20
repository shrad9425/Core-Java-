package org.main.example;

class Employee{
	int empid;
	String name;
	float salary;

	public Employee(int empid, String name, float salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result =1;
		result = result * prime + this.empid;
		return result;
	}
}
public class Program {
	
	public static void main(String[] args) {
		Employee e1 = new Employee(3778, "Ranu", 45.000f);
		Employee e2 = new Employee(3778, "Ranu", 45.000f);
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}
}
