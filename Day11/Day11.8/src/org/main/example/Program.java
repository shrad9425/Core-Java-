package org.main.example;


class Person{
	public void printRecord() {
		System.out.println("Person.prinRecord() ");
	}
}
class Employee extends Person{
	@Override
	public void printRecord() {
		System.out.println("Employee.printRecord()");
	}
}
public class Program {
	public static void main(String[] args) {
		Person p = new Employee();	//upcasting
		p.printRecord();
	}
}