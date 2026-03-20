class Test{
    int num1;
    static int num2;
    public void showRecord(){
        System.out.println("Num1 : "+num1);
    } 
    public static void displayRecord(){
        System.out.println("Num2 : "+num2);
    }
}
class Program6 {
    public static void main(String[] args) {
        Test t = new Test();
        t.showRecord();
        //Test.showRecord();    error: its not a static method
        Test.displayRecord();
        //t.displayRecord();  //warning: The static method displayRecord() from the type Test should be accessed in a static way
    }    
}
