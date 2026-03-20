package org.example.main;

class Box<T,V>{
	private T name;
	private V empid;
	public Box(T name, V empid) {
		this.name = name;
		this.empid = empid;
	}
	public T getName() {
		return name;
	}
	public V getEmpid() {
		return empid;
	}
	public void printRecord() {
		System.out.println(this.name +" "+this.empid);
	}
}


public class Program {
	public static void main(String[] args) {
		Box<String, Number> b1 = new Box<>("Ranu",113);
		b1.printRecord();
	}
}
