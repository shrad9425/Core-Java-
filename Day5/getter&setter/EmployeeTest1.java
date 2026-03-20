
import java.util.Scanner;

class Employee{
    String name;
    int empid;
    float salary;

    Employee() {
        this(null,0,0.0f);
    }

    Employee(String name, int empid, float salary) {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
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
class EmployeeTest1{
    public static void main(String[] args) {
        Employee emp = new Employee();
        Scanner sc = new Scanner (System.in);

        System.out.print("Name    : ");
        emp.setName(sc.nextLine());
        
        System.out.print("Empid   : ");
        emp.setEmpid(sc.nextInt());

        System.out.print("Salary  : ");
        emp.setSalary(sc.nextFloat());

        System.out.println(emp.getName()+", "+emp.getEmpid()+", "+emp.getSalary());
    }    
}
