package org.main.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = null;
		try {
			System.out.println("Open resource");
			sc = new Scanner(System.in);
			System.out.print("Num1:");
			int num1 = sc.nextInt();
			
			System.out.print("Num2:");
			int num2 = sc.nextInt();
			
			
			if(num2 == 0)
				throw new ArithmeticException("not divisible by 0");
			int result = num1/num2;
			System.out.println("Result:"+result);
			
			//System.exit(0);
		}catch (ArithmeticException e) {
			//e.printStackTrace();
			//System.exit(0);
			throw new RuntimeException();
		}finally {
			System.out.println("Close resource");
			sc.close();	
		}
	}
	
	
	public static void main4(String[] args) {
		Scanner sc = null;
		try {
			System.out.println("Open resource");
			sc = new Scanner(System.in);
			System.out.print("Num1:");
			int num1 = sc.nextInt();
			
			System.out.print("Num2:");
			int num2 = sc.nextInt();
			
			
			if(num2 == 0)
				throw new ArithmeticException("not divisible by 0");
			int result = num1/num2;
			System.out.println("Result:"+result);
		}catch (ArithmeticException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Close resource");
			sc.close();	
		}
	}
	
	
	public static void main3(String[] args) {
		Scanner sc = null;
		try {
			System.out.println("Open resource");
			sc = new Scanner(System.in);
			System.out.print("Num1:");
			int num1 = sc.nextInt();
			
			System.out.print("Num2:");
			int num2 = sc.nextInt();
			
			
			if(num2 == 0)
				throw new ArithmeticException("not divisible by 0");
			int result = num1/num2;
			System.out.println("Result:"+result);
		} catch (ArithmeticException  | InputMismatchException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("Close resource");
		sc.close();
	}
	
	
	
	public static void main2(String[] args) {
		Scanner sc = null;
		try {
			System.out.println("Open resource");
			sc = new Scanner(System.in);
			System.out.print("Num1:");
			int num1 = sc.nextInt();
			
			System.out.print("Num2:");
			int num2 = sc.nextInt();
			
			
			if(num2 == 0)
				throw new ArithmeticException("not divisible by 0");
			int result = num1/num2;
			System.out.println("Result:"+result);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			
		}catch(InputMismatchException e){
			e.printStackTrace();
		}
		System.out.println("Close resource");
		sc.close();
	}
	
	
	public static void main1(String[] args) {
		Scanner sc = null;
		System.out.println("Open resource");
		sc = new Scanner(System.in);
		System.out.print("Num1:");
		int num1 = sc.nextInt();
		
		System.out.print("Num2:");
		int num2 = sc.nextInt();
		
		try {
			if(num2 == 0)
				throw new ArithmeticException("not divisible by 0");
				int result = num1/num2;
				System.out.println("Result:"+result);
		} catch (Exception e) {
			//e.printStackTrace();
			//System.out.println(e.getMessage());
			
		}
		System.out.println("Close resource");
		sc.close();
	}
}
