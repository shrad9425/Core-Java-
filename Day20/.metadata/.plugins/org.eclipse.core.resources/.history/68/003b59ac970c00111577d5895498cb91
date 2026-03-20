package org.main.example;

class Task extends Thread{
	Task( ){
		this.start();
	}
	@Override
	public void run() {
		System.out.println("Start");
		try {
			for(int i=0; i<=10;i++) {
				System.out.println(this.getName()+", "+i);
				Thread.sleep(250);
			}
		} catch (InterruptedException e) {
			throw new RuntimeException ( e );
		}
		System.out.println("End");
	}
}
public class Program {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Task( );
		t1.join();
	
		Thread t2 = new Task();
		t2.join();
		
		Thread t3 = new Task();
		t3.join();
		
		Thread t4 = new Task();
		t4.join();
	}
}
