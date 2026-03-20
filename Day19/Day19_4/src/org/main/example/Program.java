package org.main.example;


class Task implements Runnable{
	private Thread thread;
	public Task(String name) {
		this.thread = new Thread(this,name);
		this.thread.start();
	}
	@Override
	public void run() {
		System.out.println("inside print method");
	}
}
public class Program {
	public static void main(String[] args) {
		
		Thread th1 = new Thread("Thread#1");
		Thread th2 = new Thread("Thread#2");
	}
}