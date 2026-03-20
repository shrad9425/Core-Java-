package org.main.example;

class MyException{
	String str;
	public MyException(String str) {
		this.str = str;
	}
}
public class Program {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;
		
		try {
			if(num2 == 0)
				//throw 0;	//No exception of type int can be thrown; an exception type must be a subclass of Throwable
				//throw "not divide by 0";	//No exception of type String can be thrown; an exception type must be a subclass of Throwable
				//throw new MyException("not divide by zero");	//No exception of type MyException can be thrown; an exception type must be a subclass of Throwable
				throw new ArithmeticException("not divide by 0");	//ok
				int result = num1/ num2;
				System.out.println("Result: "+result );
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
