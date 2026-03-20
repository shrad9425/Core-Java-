package org.main.spider;

interface A {
	void f1();
	void f4();
}
interface B{
	void f2();
	void f4();
}
interface C extends A, B{
	void f3();
}
class AbstractTest implements C{
	@Override
	public void f1() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void f2() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void f3() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void f4() {
		// TODO Auto-generated method stub
		
	}
}
class D extends AbstractTest{
	@Override
	public void f1() {
		System.out.println("D.f1()");
	}
	
}
public class Program {
	public static void main(String[] args) {
		A a = new D();
		a.f1();
		a.f4();
	}
}
