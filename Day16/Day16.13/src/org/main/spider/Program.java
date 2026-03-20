package org.main.spider;

import java.util.LinkedList;

public class Program {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		list.addLast(60);
		
		list.removeFirst();
		list.removeFirst();
		
		System.out.println(list);

		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list2.addFirst(10);
		list2.addFirst(20);
		list2.addFirst(30);
		list2.addFirst(40);
		list2.addFirst(50);
		list2.addFirst(60);
		
		list2.removeFirst();
		list2.removeFirst();
		
		System.out.println(list2);
	}
}
