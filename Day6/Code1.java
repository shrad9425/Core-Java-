class Code1 {
    public int num1 = 10;
    public static int num2 =20;
    public static void main(String[] args) {
        Code1 c = new Code1();
        //System.out.println("Num1    : "+num1);  // error: non-static variable num1 cannot be referenced from a static context
        System.out.println("Num1    : "+c.num1);
        System.out.println("Num2    : "+num2);
    }    
}
