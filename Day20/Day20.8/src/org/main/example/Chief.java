package org.main.example;

public class Chief extends Thread {
	private Kitchen kitchen;
	
	public Chief(Kitchen kitchen) {
		this.kitchen = kitchen;
	}
	@Override
	public void run() {
		try {
			while(true) {
				String order = "burger";
				kitchen.addOrder(order);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
