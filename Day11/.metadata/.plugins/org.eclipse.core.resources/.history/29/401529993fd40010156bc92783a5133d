package org.main.example;


class A{
	int num1=10;
	int num2=20;
}
class B extends A{
	int num2=30;
	int num3=40;
	public void printRecord() {
		System.out.println("num1: "+ num1);	//ok
		System.out.println("num1: "+ this.num1);	//ok
		System.out.println("num1: "+ super.num1);	//ok
		
		System.out.println("num2: "+ num2);	//shadowing-20
		System.out.println("num2: "+ this.num2);	//ok: shadowing-20
		System.out.println("num2: "+ super.num2);	//ok: 20
	}
}
public class Program {
	public static void main(String[] args) {
		B b = new B();
		b.printRecord();
	}
}