package org.main.spider;

class Box<T>{
	private Object data;
	public Box() {
		this(0);
	}
	public Box(Object data) {
		this.data = data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Object getData() {
		return data;
	}
	@Override
	public String toString() {
		return this.data.toString();
	}
}
public class Program {
	public static void main(String[] args) {
		Box b1 = new Box();
		b1.setData(123);
		String box = (String) b1.getData();	//ClassCastException
		System.out.println(box);
	}
	public static void main2(String[] args) {
		Box b1 = new Box();
		b1.setData(123);
		Object box = b1.getData();	
		System.out.println(box);
	}
	public static void main1(String[] args) {
		Box<String> box = new Box<>();
		box.setData(123);
		System.out.println(box.toString());
	}
}
