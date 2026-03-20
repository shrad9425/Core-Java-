package org.example.main;

import java.util.ArrayList;

public class Program {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);		//autoboxing
		list.add(20);		
		list.add(30);
		list.add(40);
		for( Integer element : list)
			System.out.println(element);
		
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Ranu");		//autoboxing
		list1.add("Shraddha");		
		list1.add("Swaransh");
		list1.add("Swara");
		for( String element : list1)
			System.out.println(element);
		
		ArrayList<Float> list2 = new ArrayList<>();
		list2.add(1.2f);		//autoboxing
		list2.add(1.3f);		
		list2.add(1.4f);
		list2.add(1.5f);
		for( Float element : list2)
			System.out.println(element);
	}
}
