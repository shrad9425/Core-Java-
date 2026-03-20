
import java.util.Scanner;

class Employee{
    String name;
    int empid;
    float salary;

    Employee() {
        //todo
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setEmpid(int empid){
        this.empid = empid;
    }
    public int getEmpid(){
        return empid;
    }
    public void setSalary(float salary){
        this.salary = salary;
    }
    public float getSalary(){
        return salary;
    }
}
class EmpTestRecord{
    private Employee emp = new Employee();
    private static Scanner sc = new Scanner (System.in);
    public void acceptRecord(){
        System.out.print("Name    : ");
        emp.setName(sc.nextLine());
        sc.nextLine();
        
        System.out.print("Empid   : ");
        emp.setEmpid(sc.nextInt());

        System.out.print("Salary  : ");
        emp.setSalary(sc.nextFloat());
    }
    public void printRecord(){
        System.out.println(emp.getName()+", "+emp.getEmpid()+", "+emp.getSalary());
    }
    public static int menuList(){
        System.out.println("0.Exit");
        System.out.println("1.AcceptRecord");
        System.out.println("2.PrintRecord");
        System.out.print("Enter choice  : ");
        return sc.nextInt();
    }
}
class EmployeeTest3{
    public static void main(String[] args) {
        EmpTestRecord test = new EmpTestRecord();
        int choice;
        while(( choice = EmpTestRecord.menuList()) != 0 ){
            switch (choice) {
                case 1:
                    test.acceptRecord();
                    break;
                case 2:
                    test.printRecord();
                    break;
            }
        }
    }    
}
