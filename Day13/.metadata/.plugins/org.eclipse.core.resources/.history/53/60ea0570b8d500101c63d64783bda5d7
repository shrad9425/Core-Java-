package org.main.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Program {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("Name: ");
			String name = reader.readLine();
			
			System.out.print("Empid: ");
			int empid = Integer.parseInt(reader.readLine());
			
			System.out.print("Salary: ");
			float salary = Float.parseFloat(reader.readLine());
			
			System.out.println(name +", "+empid +", "+ salary);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
