package org.example.main;

import java.io.PrintStream;

public class Program {
	public static void main(String[] args) {
		if(System.out.printf("Hello world..") != null) {
			
		}
}
	public static void main1(String[] args) {
		//public PrintStream printf(String format, Object... args)		//variable argument / arity method
		//public static String format(String format, Object... args)	//variable argument / arity method
		//public Object invoke(Object obj, Object... args)				//variable argument / arity method

		System.out.printf("%s %d %f\n", "Sandeep", 3778, 45000.50f );
		System.out.printf("%s %d\n", "Sandeep", 3778 );
		System.out.printf("%s\n", "Sandeep" );
		System.out.printf("Hello World" );
	}
}