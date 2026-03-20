package prg.main.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Program {
	public static void f1() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Age:" );
		int age = Integer.parseInt(reader.readLine());
		System.out.println(age);
	}
	public static void f2() throws IOException {
		Program.f1();
	}
	public static void f3() throws IOException {
		Program.f2();
	}
	public static void main (String[] args) {
		try {
			Program.f3();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
