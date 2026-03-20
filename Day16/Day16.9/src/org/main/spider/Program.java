package org.main.spider;
//if interface default methods are same then it is mandatory to override the methods
interface A {
	void f1();
	default void f4() {}
}
interface B{
	void f2();
	default void f4() {}
	default void f5() {}
}
class D implements A,B{
	@Override
	public void f1() {
		System.out.println("D.f1()");
	}
	@Override
	public void f2() {
		System.out.println("D.f2()");	
	}
	public void f4() {
		System.out.println("D.f4()");
	}
}
public class Program {
	public static void main(String[] args) {
		A a = new D();
		a.f1();
		a.f4();
	}
}
