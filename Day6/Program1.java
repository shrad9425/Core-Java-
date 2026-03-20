class Test{
    private final int num;  // ok
    //private final int num = 10;  // ok

    Test(){
        this.num = 10;  //ok
        //this.num = 10;  //Not ok
    }
}
class Program1 {
    public static void main(String[] args) {
        Test t = new Test();
    }
}
