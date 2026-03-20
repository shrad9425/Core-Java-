class Complex{
    private int real;
    private int imag;
    public Complex() {
        this(0, 0);
    }
    public Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }
    public void setReal(int real){
        this.real = real;
    }
    public int getReal(){
        return real;
    }
    public void setImag(int imag){
        this.imag = imag;
    }
    public int getImag(){
        return imag;
    }
}
class Program3 {
    public static void main(String[] args) {
        final Complex c = new Complex(0,20);
        //c = new Complex(50, 60);    //cannot assign a value to final variable c
        c.setReal(200);
        c.setImag(300);
        System.out.println("Number  : "+c.getReal()+" , "+c.getImag());
    }    
}
