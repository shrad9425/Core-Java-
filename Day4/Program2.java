
import java.time.LocalDate;
import java.util.Scanner;

class Date{
    int day, month, year;
    void initRecord( ){
        LocalDate ld = LocalDate.now();
        this.day = ld.getDayOfMonth();
        this.month = ld.getMonthValue();
        this.year = ld.getYear();
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

class Program2 {
    public static void main(String[] args) {
        Date dt1 = new Date();
        dt1.initRecord( );      //17-11-2025
        dt1.acceptRecord();     //13-9-2003
        dt1.initRecord( );      //17-11-2025
        dt1.printRecord();
    }    
}
