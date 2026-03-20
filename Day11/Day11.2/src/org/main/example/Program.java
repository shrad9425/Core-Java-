package org.main.example;


class Complex{
	private int real;
	private int imag;
	public Complex( ) {
		this(0,0);
	}
	public Complex(int real, int imag) {
		this.real = 10;	
		this.imag = 20;
	}
	public int getReal( ) {
		return this.real;
	}
	public void setReal(int real) {
		real = real;	//shadowing
	}
	public int getImag() {
		return imag;
	}
	public void setImag(int imag) {
		this.imag = imag;
	}
	
}
public class Program {
	public static void main(String[] args) {
		Complex c1 = new Complex();
		c1.setReal(50);
		c1.setImag(100);
		System.out.println("Real:"+c1.getReal());
	}

}
