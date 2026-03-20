class Singleton{
    private int num1;
    private int num2;
    private Singleton( ){
        System.out.println("inside constructor");
        this.num1 = 10;
        this.num2 = 20;
        }
    private static Singleton reference;
    public static Singleton getReference(){
        if (reference == null)
            reference = new Singleton();
        return reference;
    }
    public int getNum1(){
        return this.num1;
    }
    public int getNum2(){
        return this.num2;
    }
}
class Program2 {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getReference();
        Singleton s2 = Singleton.getReference();
    }    
}
