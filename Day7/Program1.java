class Complex{
    private int real;
    private int imag;

    public Complex( ){
        this.real = real;
        this.imag = imag;
        System.out.println("inside constructor.");
    }
    public static void test( ){
        Complex c1 = new Complex();
    }
}
class Program1 {
    public static void main(String[] args) {
        Complex c = new Complex();
        Complex.test();  //error: when constructor is pkg level private
    }    
}
