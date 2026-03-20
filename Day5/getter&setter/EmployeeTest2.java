
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
    public void acceptRecord(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Name    : ");
        emp.setName(sc.nextLine());
        
        System.out.print("Empid   : ");
        emp.setEmpid(sc.nextInt());

        System.out.print("Salary  : ");
        emp.setSalary(sc.nextFloat());
    }
    public void printRecord(){
        System.out.println(emp.getName()+", "+emp.getEmpid()+", "+emp.getSalary());

    }
}
class EmployeeTest2{
    public static void main(String[] args) {
        EmpTestRecord test = new EmpTestRecord();
        test.acceptRecord();
        test.printRecord();
    }    
}
