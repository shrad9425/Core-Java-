package org.main.example;


class Task implements Runnable{
	private Thread thread;
	public Task(String t ) {
		this.thread = new Thread(this);
		this.thread.start();
		System.out.println("inside task constructor");
	}
	@Override
	public void run() {
		System.out.println("inside Task.print method "+Thread.currentThread().getName());
	}
}
class A extends Task{
	
	public A( String t) {
		super(t);
		System.out.println("inside A constructor");
	}

	@Override
	public void run() {
		super.run();
	}
}
class B extends A{
	public B(String t) {
		super(t);
		System.out.println("inside B constructor");
	}
	@Override
	public void run() {
		super.run();

	}
}
public class Program {
	public static void main(String[] args) {
		Task a = new B("Thread#1");
		Task b = new A("Thread#2");
	}
}
		/*output
		inside task constructor
		inside A constructor
		inside B constructor
		inside task constructor
		inside A constructor
		inside Task.print method Thread-1
		inside Task.print method Thread-0
		*/