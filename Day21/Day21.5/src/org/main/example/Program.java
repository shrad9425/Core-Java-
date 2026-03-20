package org.main.example;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Program {
	//traversing using ListIterator
		public static void main2(String[] args) {
			Vector<Integer> v = new Vector<>();
			for(int i=1; i<=10;i++) {
				v.add(i);
			}
			Integer element = null;
			ListIterator<Integer> list = v.listIterator();
			while(list.hasNext()) {
				element = list.next();
				System.out.print(element+" ");
			}
			System.out.println();
			while(list.hasPrevious()) {
				element = list.previous();
				System.out.print(element+" ");
			}
		}
	
	//traversing using Iterator
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		for(int i=1; i<=10;i++) {
			v.add(i);
		}
		Integer element = null;
		Iterator<Integer> itor = v.iterator();
		while(itor.hasNext()) {
			element = itor.next();
			System.out.println(element);
		}
	}
	
	//traversing using enumeration
	public static void main1(String[] args) {
		Vector<Integer> v = new Vector<>();
		for(int i=1; i<=10;i++) {
			v.add(i);
		}
		Integer element = null;
		Enumeration<Integer> e = v.elements();
		while(e.hasMoreElements()) {
			element = e.nextElement();
			System.out.println(element);
		}
	}
}
