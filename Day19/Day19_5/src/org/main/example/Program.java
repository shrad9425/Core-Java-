package org.main.example;


class Task extends Thread{
	public Task(String name) {
		super(name);
		this.start();
	}
	@Override
	public void run() {
		System.out.println("inside print method");
	}
}
public class Program {
	public static void main(String[] args) {
		
		Thread th1 = new Task("Thread#1");
		Thread th2 = new Task("Thread#2");
	}
}