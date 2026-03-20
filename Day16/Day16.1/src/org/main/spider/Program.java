package org.main.spider;

import java.util.Date;

public class Program {
	public static void print(Object obj) {
		System.out.println(obj);
	}
	public static void main(String[] args) {
		Program.print(123);
		Program.print("A");
		Program.print("Hello world");
		Program.print(3.14);
		Program.print(10.10f);
		Program.print(true);
		Program.print(1234567);
		Program.print(new Date());
	}
	public static void main1(String[] args) {
		System.out.println(123);
		System.out.println("A");
		System.out.println("Hello world");
		System.out.println(3.14);
		System.out.println(10.10f);
		System.out.println(true);
		System.out.println(1234567);
		System.out.println(new Date());
	}
}
