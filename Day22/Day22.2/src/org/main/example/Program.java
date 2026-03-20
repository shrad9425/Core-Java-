package org.main.example;

public class Program {
	public static int hashCode(int element) {
		final int prime = 31;
		int result = 15;
		result = result * prime + element;
		return result;
	}
	public static void main(String[] args) {
		for(int count =1; count <=100; count++) {
			int data = count;
			int hashCode = Program.hashCode(data);
			int slot = hashCode % 7;
			System.out.println(count+"	"+hashCode+"	"+slot);
		}
	}
	
	public static void main1(String[] args) {
		int empid = 3708;
		int hashCode = Program.hashCode(empid);
		int slot = hashCode % 7;
		System.out.println(empid+"	"+hashCode+"	"+slot);
		
	}
}
