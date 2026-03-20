class Test{
    int num1, num2;
    private static int num3;

    static{
        Test.num3 = 300;
    }
    Test(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        //this.num3 = 300;  //we can use but non recommended =>  static field accessing only in static initalizer block
        //Test.num3 = num3; 

    }
    public void printRecord(){
        System.out.println("Num1 : "+this.num1);
        System.out.println("Num2 : "+this.num2);
        System.out.println("Num3 : "+this.num3);
    }
}
class Program {
    public static void main(String[] args) {
        Test t1 = new Test(11,22);  //11,22,300
        t1.printRecord();
        Test t2 = new Test(20,10);  //20,10,300
        t2.printRecord();
        Test t3 = new Test(1,2);    //1,2,300
        t3.printRecord();
    }    
}
