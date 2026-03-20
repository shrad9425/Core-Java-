import java.util.Scanner;

class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println("Num : " + num);

        String str1 = sc.next();
        System.out.println("Str1 : " + str1); 
        
        sc.nextLine(); // Consume the leftover newline character

        String str2 = sc.nextLine(); 
        System.out.println("Str2 : " + str2);
    
    }    
}
