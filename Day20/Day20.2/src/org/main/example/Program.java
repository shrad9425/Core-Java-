package org.main.example;

class Task implements Runnable{
	private Thread th;
	public Task() {
		this.th = new Thread(this); 
		this.th.setPriority(th.NORM_PRIORITY);
		this.th.start();
	}
	@Override
	public void run() {
		System.out.println(th.getPriority());
		
	}
}
public class Program {
	public static void main(String[] args) {
		Runnable t = new Task();
	}
}
