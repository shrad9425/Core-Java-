package org.main.example;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Program {
	public static List<Integer> getList() {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		return list;
	}
	public static int getCapacity(List<Integer> list) throws Exception{
		Class<?> c = list.getClass();
		Field field = c.getDeclaredField("elementData");
		field.setAccessible(true);
		Object[] elementData = (Object[]) field.get(list);
		
		return elementData.length;
	}
	public static void main(String[] args) {
		try {
			List<Integer> list = Program.getList();
			System.out.println("List size	:	"+list.size());
			
			int capacity = Program.getCapacity(list);
			System.out.println("List Capacity	:	"+capacity);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public static void main4(String[] args) {
		List<Integer> list = Program.getList();
		ListIterator<Integer> itor = list.listIterator();
		Integer element = null;
		while(itor.hasNext()) {
			element = itor.next();
			System.out.print(element+"	");
		}System.out.println();
		
		while(itor.hasPrevious()) {
			element = itor.previous();
			System.out.print(element+"	");
		}
	}
	
	public static void main3(String[] args) {
		List<Integer> list = Program.getList();
		//int action = System.out::println;
		list.forEach(System.out::println);
	}
	
	public static void main2(String[] args) {
		List<Integer> list = Program.getList();
		for(int element : list) {
			System.out.println(element);
		}
	}
	
	public static void main1(String[] args) {
		List<Integer> list = Program.getList();
		Integer element = null;
		Iterator<Integer> itor = list.iterator();
		while(itor.hasNext()) {
			element = itor.next();
			System.out.println(element);
		}
	}
}
