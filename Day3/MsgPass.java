
import java.util.Scanner;

class Date{
    int day, month, year;
    void acceptRecord(){
        Scanner sc = new Scanner(System.in);
        //System.out.print("Day : ");
        day = sc.nextInt();
        //System.out.print("Month : ");
        month = sc.nextInt();
        //System.out.print("Year : ");
        year = sc.nextInt();
    }
    void printRecord(){
        System.out.println(day+" / "+month+" / "+year);
    }   
}
class MsgPass {
    public static void main(String[] args) {
        Date dt = new Date();
        dt.acceptRecord();
        dt.printRecord();
    }    
}
