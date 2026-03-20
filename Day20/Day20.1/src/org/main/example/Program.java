package org.main.example;

public class Program {
	public static void main2(String[] args) {
		Thread t = Thread.currentThread();
		t.setPriority(t.getPriority()+2);
		//t.setPriority(t.getPriority()+6);	//IllegalArgumentException
		System.out.println(t.getPriority()+", "+t.getName());
	}
	
	public static void main1(String[] args) {
		Thread th = Thread.currentThread();
		int priority = th.getPriority();
		System.out.println(priority+", "+th.getName());
	}
}
