package org.main.example;


public class Program {
	public static void main(String[] args) {
		String str = "ranu";
		str = str + "shradhha";
		System.out.println(str);
	}
	public static void main2(String[] args) {
		String str = new String("ranu");
		//char ch = str.charAt(5);	//java.lang.StringIndexOutOfBoundsException
		char ch = str.charAt(3);
		System.out.println(ch);
	}
	public static void main1(String[] args) {
		char[] ch = {'c','a','t','s'};
		String str = new String(ch);
		System.out.println(str);
	}
}
