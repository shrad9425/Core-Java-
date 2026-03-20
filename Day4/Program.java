class Employee{
    String name;        //null
    int empid;          //0

    void acceptRecord(String name, int empid){
        this.name = name;
        this.empid = empid;
    }
    void printRecord(){
        System.out.println("Name    : "+name);
        System.out.println("Empid   : "+empid);
    }
    void displayRecord(){
        System.out.println(this.name +", "+ this.empid);
    }
}
class Program {
    public static void main(String[] args) {
        //Employee emp = new Employee();
        Employee emp = null;    //NullPointerException
        emp.acceptRecord("Shraddha", 3778);
        emp.printRecord();
        emp.displayRecord();
    }    
}