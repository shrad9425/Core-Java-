class Employee{
    String name;
    int empid;
    float salary;

    Employee() {
        this("null", 0, 0);
    }

    Employee(String name, int empid, float salary) {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }
    public String toString(){
        return this.name+", "+ this.empid+", "+ this.salary;
        //return String.format("%-15s%-10d%-10.2f",  this.name, this.empid, this.salary);
    }
    
}
class Demo {
    public static void main(String[] args) {
        Employee emp = new Employee("Shraddha", 3778, 45000);
        String str = emp.toString();
        System.out.println(str);
    }    
}
