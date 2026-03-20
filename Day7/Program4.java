class Test{
    private int num1;
    private int num2;
    private static int num3;

    static{
        Test.num3 = 0;
    }

    Test() {
        this(0, 0);
    }
    
    Test(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        //this.num3 = num3;   //The static field Test.num3 should be accessed in a static way
    }
    public void setNum1(int num1){
        this.num1 = num1;
    }
    public void setNum2(int num2){
        this.num2 = num2;
    }
    public static void setNum3(int num3){
        Test.num3 = num3;
    }
    void PrintRecord(){
        System.out.println(this.num1);
        System.out.println(this.num2);
        System.out.println(Test.num3);
    }
}
class Program4 {
    public static void main(String[] args) {
        Test t1 = new Test(); 
        t1.setNum1(10);
        t1.setNum2(20);
        Test.setNum3(30);
        t1.PrintRecord();
    }    
}
