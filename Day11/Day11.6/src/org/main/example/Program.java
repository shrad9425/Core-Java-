package org.main.example;


class Person{
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void printRecord() {
		System.out.println("Name	: "+this.name);
		System.out.println("Age	: "+this.age);
	}
}
class Employee extends Person{
	int empid;
	float salary;
	public Employee(String name, int age, int empid, float salary) {
		super(name, age);
		this.empid = empid;
		this.salary = salary;
	}
	public void printRecord() {
		super.printRecord();
		System.out.println("Empid	: "+this.empid);
		System.out.println("Salary	: "+this.salary);
	}
}
public class Program {
	public static void main(String[] args) {
		//Upcasting: converting reference of sub class into super class
		Person p = new Employee("ranu",22,1003,45000.00f);
		p.printRecord();
		
		Employee emp = (Employee)p;//downcasting
		emp.printRecord();
	}
	public static void main1(String[] args) {
		Employee emp = new Employee("ranu",22,1003,45000.00f);
		emp.printRecord();
		
	}
}