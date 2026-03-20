package org.main.spider;


public class Program {
	public static <T extends Number>void print(T obj) {
		System.out.println(obj);
	}
	public static void main(String[] args) {
		Program.print(123);
		//Program.print("A");				//not ok
		//Program.print("Hello world");	//not ok
		Program.print(3.14);
		Program.print(10.10f);
		//Program.print(true);			//not ok
		Program.print(1234567);
		//Program.print(new Date());		//not ok
	}
}
