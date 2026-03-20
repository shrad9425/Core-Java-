package org.example.main;

enum Color{
	RED, BLUE, YELLOW
}
public class Program {
	public static void main(String[] args) {
		Color[] colors = Color.values();
		for( Color color : colors )
			System.out.println("ENUM	: "+color.name()+", "+color.ordinal());
	}
	public static void main2(String[] args) {
		Color color = Color.RED;
		System.out.println(color.RED.name());
		
		color = Color.BLUE;
		System.out.println(Color.BLUE.name());
		
		color = Color.YELLOW;
		System.out.println(Color.YELLOW.name());
	}
	public static void main1(String[] args) {
		// enum constants
		System.out.println(Color.RED.name());
		System.out.println(Color.BLUE.name());
		System.out.println(Color.YELLOW.name());
		
		//ordinals
		System.out.println(Color.RED.ordinal());
		System.out.println(Color.BLUE.ordinal());
		System.out.println(Color.YELLOW.ordinal());
	}
}