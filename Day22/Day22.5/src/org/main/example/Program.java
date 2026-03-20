package org.main.example;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Program {
	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<Integer>();
		set.add(51);
		set.add(21);
		set.add(41); 
		set.add(31);
		//System.out.println(set.toString());
		List<Integer> set1 = new ArrayList<Integer>(set);
		System.out.println(set1.toString());
	}
	public static void main2(String[] args) {
		Set<Integer> set = new LinkedHashSet<Integer>();
		set.add(51);
		set.add(21);
		set.add(21); //ignore: doesn't contain duplicate
		set.add(null);//contain null
		System.out.println(set.toString());
	}
	
	public static void main1(String[] args) {
		Set<Integer> set = new LinkedHashSet<Integer>();
		set.add(51);
		set.add(21);
		set.add(31);
		set.add(41);
		System.out.println(set.toString());
	}
}
