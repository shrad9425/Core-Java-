class Student{
    private String name;
    private int rollno;
    private int marks;

    Student() {
        this("ranu", 21, 35);
    }

    Student(String name, int rollno, int marks) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setRollNumber(int rollno){
        this.rollno = rollno;
    }
    public int getRollNumber(){
        return rollno;
    }
    public void setMarks(int marks){
        this.marks = marks;
    }
    public int getMarks(){
        return marks;
    }
    
}
class Program {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Shraddha");
        System.out.println("Name    : "+s1.getName());

        s1.setRollNumber(2);
        System.out.println("Roll No : "+s1.getRollNumber());

        s1.setMarks(25);
        System.out.println("MArks   : "+s1.getMarks());
    }
}
