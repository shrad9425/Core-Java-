package org.main.example;


class Person{
	public void printRecord() {
		System.out.println("Person.prinRecord() ");
	}
}
class Employee extends Person{
	public void printRecord() {
		System.out.println("Employee.printRecord()");
	}
}
public class Program {
	public static void main(String[] args) {
		Person p = new Employee();	//upcasting
		p.printRecord();
		//dynamic dispatch method: in upcasting, process of calling methods 
		//of sub class using reference of super class
	}
}