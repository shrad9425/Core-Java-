
import java.util.Scanner;

class Date{
    int day, month, year;
    void initRecord(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    void acceptRecord(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Day   : ");
        this.day = sc.nextInt();
        System.out.print("Month   : ");
        this.month = sc.nextInt();
        System.out.print("Year   : ");
        this.year = sc.nextInt();
    }
    void printRecord(){
        System.out.println("Date    : "+this.day+" - "+this.month+" - "+this.year);
    }
}

class Program1 {
    public static void main(String[] args) {
        Date dt1 = new Date();
        dt1.initRecord(1,4,2023);
        dt1.acceptRecord(); //13-9-2003
        dt1.initRecord(0,0,0);  //0-0-0
        dt1.printRecord();
    }    
}
