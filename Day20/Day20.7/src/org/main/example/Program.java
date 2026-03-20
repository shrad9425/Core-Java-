package org.main.example;


class MovieTicketApp extends Thread{ 
	int total=0;
	@Override
	public void run() {
		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				total = total + 100;
			}
			this.notify();
		}
	}
	
}

public class Program {
	public static void main(String[] args) throws InterruptedException{
		MovieTicketApp mt = new MovieTicketApp();
		mt.start();
		//System.out.println("Total :"+mt.total +" Rs");
		synchronized ( mt) {
			mt.wait();
			System.out.println("Total :"+mt.total +" Rs");
			
		}

	}
}
