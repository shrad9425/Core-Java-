import java.util.Scanner;

//Final local variables
class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        final int num = sc.nextInt();
        //num = num+2;    // Error: cannot assign a value to final variable num
        System.out.println(num);
    }
    public static void main3(String[] args) {
        final int num;  
        num = 10;   //assignment
        System.out.println(num);
    }
    public static void main2(String[] args) {
        final int num = 10; //initalization
        //num = 20; // Error: cannot assign a value to final variable num
        //num =30;  //not ok
        System.out.println(num);
    }  
    public static void main1(String[] args) {
        int num = 10;   //initialization
        num = 20;       //assignment
        num =30;        //assignment
        System.out.println(num);
    }    
}
