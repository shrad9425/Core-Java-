package org.main.example;

abstract class A{
	public abstract void print();
}

class B extends A{
	public void print() throws RuntimeException{
		try {
			for (int count =1; count <= 10; ++count)
				System.out.println(count);
				Thread.sleep(500);
		}catch(InterruptedException cause){
			throw new RuntimeException(cause);	//exception chaining
		}
	}
}
public class Program {
	public static void main(String[] args) {
		try {
			A a = new B();
			a.print();//dynamic dispatch method
		} catch (Exception e) {
			//e.printStackTrace();
			Throwable cause = e.getCause();
			System.out.println(cause);
		}
	}
}
