
import java.util.Scanner;

class Employee{
    String name;
    int empid;

    void acceptRecord(){
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        empid = sc.nextInt();
    }
    void printRecord(){
        System.out.println("Name : "+name);
        System.out.println("Empid : "+empid );
    }
}
class Program5 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.acceptRecord();
        emp.printRecord();
    }    
}
