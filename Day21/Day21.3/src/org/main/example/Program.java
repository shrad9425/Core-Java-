package org.main.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Program {
	//converting arraylist into array
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(30);
		list.add(50);
		list.add(20);
		list.add(80);
		list.add(60);
		list.add(40);
		//System.out.println(list.toArray()); //[Ljava.lang.Object;@24d46ca6
		System.out.println(list);
		Integer[] i = new Integer[list.size()];
		list.toArray(i);
		System.out.println(Arrays.toString(i));
		
		//using Arrys.asList() method
		list = Arrays.asList(10,60,40);
		System.out.println(list.getClass().getName());
		System.out.println(list);
	}

	
	//to sort ArrayList
	public static void main6(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(30);
		list.add(50);
		list.add(20);
		list.add(80);
		list.add(60);
		list.add(40);
		System.out.println(list.toString());
		//Collections.sort(list);
		list.sort(null);	//null indicates natural ordering
		System.out.println(list.toString());
	}
	
	private static List<Integer> getList() {
		List<Integer> list = new ArrayList<>();
		for(int i=1; i <= 10; i++) {
			list.add(i*10);
		}
		return list;
	}
	//to search and remove single element from ArrayList
	public static void main5(String[] args) {
		List<Integer> list = Program.getList();
		System.out.println(list);
		Integer key = new Integer(30);
		 if(list.contains(key)) {
			 //int index = list.indexOf(key);
			 //list.remove(index);
			 list.remove(key);
			 System.out.println(list);
		 }else {
			 System.out.println(key+ " not found");
		 }
	}
	
	//to search and remove multiple elements from ArrayList
	public static void main4(String[] args) {
		List<Integer> list = Program.getList();
		Collection<Integer> c = new ArrayList<>();
		c.add(20);
		c.add(50);
		c.add(60);
		
		System.out.println(list);
		if(list.containsAll(c)) {
			list.removeAll(c);
			System.out.println(list );
		}else {
			System.out.println(c +" not found");
		}
	}
	
	//to search single element from ArrayList
	
	public static void main3(String[] args) {
		List<Integer> list = Program.getList();
		int key = 30;
		if(list.contains(key)) {
			int index = list.indexOf(key);
			System.out.println(key +" is found at index "+index);
		}else {
			System.out.println(key +" is not found.");
		}
	}
	
	public static void main2(String[] args) {
		Collection<Integer> collection = new ArrayList<>();
		collection.add(10);
		collection.add(20);
		collection.add(30);

		//List<Integer> list = new ArrayList<>(collection);//ok
		List<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(12);
		list.add(13);
		list.addAll(3,collection);
		System.out.println(list.toString());
	}
	
	public static void main1(String[] args) {
		Collection<Integer> collection = new ArrayList<>();
		collection.add(10);
		collection.add(20);
		collection.add(30);

		//List<Integer> list = new ArrayList<>(collection);//ok
		List<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(12);
		list.add(13);
		list.addAll(collection);
		System.out.println(list.toString());
	}
}
