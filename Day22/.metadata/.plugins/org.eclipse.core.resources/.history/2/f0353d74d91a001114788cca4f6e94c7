package org.main.example;

import java.util.HashSet;
import java.util.Set;

public class Program {
	private static Set<Integer> getSet() {
		Set<Integer> set = new HashSet<>();
		set.add(30);
		set.add(50);
		set.add(10);
		set.add(40);
		set.add(20);
		return set;
	}
	private static boolean removeSet(Set<Integer> set) {
		boolean rm = set.remove(200);
		return rm;
	}
	private static void getSize(Set<Integer> set) {
		int size = set.size();
		System.out.println(size);
	}
	
	public static void main(String[] args) {
		Set<Integer> set = Program.getSet();
		boolean remove = Program.removeSet(set);
		System.out.println(remove);
		Program.getSize(set);
	}
	
	
	
	public static void main2(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(30);
		set.add(50);
		set.add(10);
		set.add(40);
		set.add(null);
		System.out.println(set);
	}
	
	public static void main1(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(30);
		set.add(50);
		set.add(10);
		set.add(40);
		set.add(20);
		
		set.add(30);
		set.add(50);
		set.add(10);
		set.add(40);
		set.add(20);
		System.out.println(set);
	}
}
