class Complex{
    private int real;
    private int imag;

    private Complex( ){
        this.real = real;
        this.imag = imag;
        System.out.println("inside constructor.");
    }
    public static void test( ){
        Complex c1 = new Complex();  //ok
    }
}
class Program2 {
    public static void main(String[] args) {
        //Complex c = new Complex();  // error: Complex() has private access in Complex
        Complex.test();  
    }    
}
