package org.main.example;

class Employee {	//sub class
	private String name;
	private int age;
	private int empid;
	private float salary;

	public Employee( ) {
		this.name = name;
		this.age = 0;
		this.empid = 0;
		this.salary = 0.0f;
	}
	public Employee(String name, int age, int empid, float salary) {
		this.name = name;
		this.age = age;
		this.empid = empid;
		this.salary = salary;
	}
	public void displayRecord() {
		System.out.println("Name	:"+this.name);
		System.out.println("Age	:"+this.age);
		System.out.println("Empid	:"+this.empid);
		System.out.println("Salary	:"+this.salary);
	}
}
public class Program {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.displayRecord();
	
	}
}
