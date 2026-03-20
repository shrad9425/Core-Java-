package org.main.example;

import java.util.LinkedList;

public class Kitchen {
	private LinkedList<String> link = new LinkedList<String>();
	private int maxOrder = 10;
	public synchronized void addOrder(String order) {
		try {
			while(link.size() == maxOrder) {
				wait();
			}
			link.add(order);
			System.out.println("Order added	:	"+order);
			notifyAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public synchronized String getOrder( ) throws InterruptedException {
		while(link.size() == 0) {
			wait();
		}
		String order = link.removeFirst();
		System.out.println("Order is Ready	:	"+order);
		notifyAll();
		
		return order;
	}
}
