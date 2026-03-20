class Test{
    public static int num1 = 10;   //non-static field
}
class Program5 {
    public static int num2 = 20;    //static field
    public static void main(String[] args) {
        //System.out.println("Num1    : "+num1);    //not ok
        System.out.println("Num1    : "+Test.num1);
        //System.out.println("Num2    : "+num2);
        System.out.println("Num2    : "+Program5.num2);
    }    
}
