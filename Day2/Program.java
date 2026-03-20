class Program {
    public static void main(String[] args) {
        int num;    //reference
        //num = 10;   //Assignment : multiple times
        num = 20;
        int num1 = 30; //ok: Initalization
        //int num1 = 40;  //not ok: initalize only once
        System.out.println("Num : " + num);
        System.out.println("Num1 : " + num1);
    }
}
