package prg.main.example;

abstract class A {
	public abstract void f1();
	public final void f2() {
		System.out.println("A.f2( )");
	}
	public abstract void f3();
}
class B extends A{
	@Override
	public final void f1() {
		System.out.println("B.f1( )");
	}
	@Override
	public void f3() {
		System.out.println("B.f3( )");
	}

}
class C extends B{
	@Override
	public void f3() {
	System.out.println("C.f3( )");
	}
}

public class Program {
	public static void main(String[] args) {
		B b = new B();
		b.f1();	//B.f1()
		b.f2();	//A.f2()
		b.f3();	//B.f3()
		
		C c = new C();
		c.f1();	//B.f1()
		c.f2();	//A.f2()
		c.f3();	//C.f3()
	}
}
