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
class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Shraddha");
        System.out.println("Name    : "+emp.getName());
        emp.setEmpid(3778);
        System.out.println("Empid    : "+emp.getEmpid());
        emp.setSalary(45000.50f);
        System.out.println("Salary    : "+emp.getSalary());
    }    
}
