package org.example.main;

import java.util.Scanner;

enum ArithematicOperation{
	EXIT, SUM, SUB, MULTIPLY, DIVISION
}
class ArithematicOperationTest{
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	public static int sub(int num1, int num2) {
		return num1 - num2;
	}
	public static int multiply(int num1, int num2) {
		return num1 * num2;
	}
	public static int division(int num1, int num2) {
		return num1 / num2;
	}
	public static void printRecord(int result) {
		System.out.println("Result	: "+result);
	}
	static Scanner sc = new Scanner(System.in);
	public static ArithematicOperation menuList( ){
		System.out.println("0.Exit");
		System.out.println("1.Sum");
		System.out.println("2.subtraction");
		System.out.println("3.Multiply");
		System.out.println("4.Division");
		System.out.print("Enter choice	: ");
		int choice = sc.nextInt();
		return ArithematicOperation.values()[choice];
		
	}
}

class Program {
	public static void main(String[] args) {
		ArithematicOperation choice;
		while((choice = ArithematicOperationTest.menuList()) != ArithematicOperation.EXIT) {
			int result = 0;
			switch( choice ) {
			case SUM:
				result = ArithematicOperationTest.sum(10, 20);
				break;
			case SUB:
				result = ArithematicOperationTest.sub(20, 10);
				break;
			case MULTIPLY:
				result = ArithematicOperationTest.multiply(10, 20);
				break;
			case DIVISION:
				result = ArithematicOperationTest.division(100, 20);
				break;
			}
			ArithematicOperationTest.printRecord(result);
		}
	}
}
