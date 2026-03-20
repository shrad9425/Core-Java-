package org.main.example;


class A{
	public void showRecord() {
		System.out.println("A.showRecord()");
	}
	public void printRecord() {
		System.out.println("A.printRecord()");
	}
}
class B extends A{
	public void displayRecord() {
		System.out.println("B.displayRecord()");
	}
	public void printRecord() {
		System.out.println("B.printRecord()");
	}
}
public class Program {
	public static void main(String[] args) {
		B b = new B();
		b.displayRecord();	//shadowing
		b.showRecord();
		b.printRecord();
	}
}