package org.main.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Program {
	public static List<Integer> getList() {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		return list;
	}
	public static void main(String[] args) {
		int[] arr = new int[] {10,20,30};
		int element = arr[arr.length];	//ArrayIndexOutOfBoundsException
		System.out.println(element);
		
		String str = new String("ranu");
		char ch = str.charAt(str.length());	//StringIndexOutOfBoundsException
		System.out.println(ch);
		
		List<Integer> list = Program.getList();
		int element1 = list.get(list.size());//IndexOutOfBoundsException
		System.out.println(element1);
	}
	
	public static void main4(String[] args) {
		List<Integer> list = Program.getList();
		Integer element = null;
		for(int index = 0; index < list.size(); index++) {
			element = list.get(index);
			System.out.print(element+"	");
		}
	}
	
	public static void main3(String[] args) {
		List<Integer> list = Program.getList();
		System.out.println(list.toString());
	}
	
	public static void main2(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list.toString());
	}
	
	public static void main1(String[] args) {
		Collection<Integer> collection = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		ArrayList<Integer> arr = new ArrayList<>();
	}
}
