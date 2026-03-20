package org.main.example;

class Task extends Thread{
	private Thread th;
	public Task() {
		this.th = new Thread(this); 
		this.th.setPriority(th.NORM_PRIORITY);
	}
	@Override
	public void run() {
		System.out.println(th.getPriority()+", "+th.getName());
		
	}
}
public class Program {
	public static void main(String[] args) {
		Thread t = new Task();
		t.start();
	}
}
