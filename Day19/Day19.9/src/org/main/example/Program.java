package org.main.example;

class Task implements Runnable{
	private Thread thread;
	public Task() {
		this.thread = new Thread(this);
		this.thread.start();
	}
	public Task(String name) {
		this.thread = new Thread(this, name);
		this.thread.start();
	}
	@Override
	public void run() {
		for(int i=0; i <= 100; i++) {
			System.out.println(i);
			if(i == 50) {
				Thread.currentThread().interrupt();	//notification sent to thread
				//System.out.println("interrupteed");
			}
		}
		
	}
}
public class Program {
	public static void main(String[] args) {
		Runnable th = new Task( );
	}
}
