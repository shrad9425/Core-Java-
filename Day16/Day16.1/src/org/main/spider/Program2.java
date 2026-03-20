package org.main.spider;

import java.util.Date;

public class Program2 {
	public static <T>void print(T obj) {
		System.out.println(obj);
	}
	public static void main(String[] args) {
		Program2.print(123);
		Program2.print("A");
		Program2.print("Hello world");
		Program2.print(3.14);
		Program2.print(10.10f);
		Program2.print(true);
		Program2.print(1234567);
		Program2.print(new Date());
	}
}
