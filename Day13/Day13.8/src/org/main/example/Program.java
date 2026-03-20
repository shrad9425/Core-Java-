package org.main.example;

import java.util.Scanner;
import org.main.example.Collection.Stack;
import org.main.example.Exception.StackOverflowException;
import org.main.example.Exception.StackUnderflowException;

public class Program {
	private static Scanner sc = new Scanner(System.in);
	public static void acceptRecord(int[] element) {
		if (element != null)
			System.out.print("Enter an element:");
			element[0] = sc.nextInt();
	}
	public static void printRecord(int[] element) {
		if (element != null)
			System.out.println("Pop element: "+element[0]);
	}
	public static int menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Push");
		System.out.println("2.Pop");
		System.out.print("Enter choice: ");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int choice;
		int[] element = new int[1];
		Stack stack = new Stack(5);
		while((choice = Program.menuList()) != 0) {
			try {
				switch(choice) {
					case 1:
						Program.acceptRecord(element);
						stack.push(element[0]);
						break;
					case 2:
						element[0] = stack.peek();
						stack.pop();
						break;
				}
			}catch(StackOverflowException | StackUnderflowException e){
				System.out.println(e.getMessage());
			}
		}
	}
}
