package org.main.example;


public class Program {
	public static void main(String[] args) {
		Integer i = new Integer(12);
		Class<?> c = Integer.TYPE; //only for wrapper class
		System.out.println(c);
	}
	public static void main3(String[] args) {
		String str = "java.lang.Scanner";
		//Class<?> c = str.getClass();//ok
		Class<?> c;
		try {
			c = Class.forName(str);		//if we don't know the compiling class
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main2(String[] args) { 
		Class<?> c = int.class;
		System.out.println(c);
		
		Class<?> c1 = Number.class;	//if we want to find any primitive type
		System.out.println(c1);
	}
	public static void main1(String[] args) {
		Integer i = new Integer(123);
		Class<?> c = i.getClass();
		System.out.println(c);
	}
}
