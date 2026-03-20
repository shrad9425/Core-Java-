package org.main.example;

public class Restruant {
	public static void main(String[] args){
		Kitchen kitchen = new Kitchen();
		Thread chiefThread = new Thread(new Chief(kitchen));
		Thread waiterThread = new Thread(new Waiter(kitchen));
		chiefThread.start();
		waiterThread.start();
	}
}
