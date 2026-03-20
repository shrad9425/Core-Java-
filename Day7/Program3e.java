class Test{
    int num1;
    int num2;
    static int num3;

    static{
        Test.num3 = 0;
    }
    public Test(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        //this.num3 = num3;   //The static field Test.num3 should be accessed in a static way
    }
    void PrintRecord(){
        System.out.println(this.num1);
        System.out.println(this.num2);
        System.out.println(Test.num3);
    }
    
}
class Program3e {
    public static void main(String[] args) {
        Test t1 = new Test(10,20); 
        t1.PrintRecord();
    }    
}
