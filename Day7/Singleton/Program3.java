class Singleton{
    private int num1;
    private int num2;
    private static Singleton reference;
    static{
        reference = new Singleton();    //static block calls only once
    }
    public static Singleton getReference(){
        return reference;
    }
    private Singleton( ){
        System.out.println("inside constructor");
        this.num1 = 10;
        this.num2 = 20;
    }
    public int getNum1() {
        return this.num1;
    }
    public int getNum2() {
        return this.num2;
    }
}
class Program3{
    public static void main(String[] args) {
        Singleton s1 = Singleton.getReference();
        Singleton s2 = Singleton.getReference();
    }    
}
