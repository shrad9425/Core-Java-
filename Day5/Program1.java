import java.time.LocalDate;

class Date{
    int day;
    int month;
    int year;
        
    Date(  ){ 
        System.out.println("Inside Parameterless");
        LocalDate ld = LocalDate.now();
        this.day = ld.getDayOfMonth();
        this.month = ld.getMonthValue();
        this.year = ld.getDayOfYear();
    }
        Date( int day, int month, int year ){ //Constructor
        System.out.println("Inside Parameterized");
        LocalDate ld = LocalDate.now();
        this.day = ld.getDayOfMonth();
        this.month = ld.getMonthValue();
        this.year = ld.getDayOfYear();
    }
}
class Program1 {   
        public static void main(String[] args) {
        Date dt1 = new Date( 23, 7, 1983 );
        Date dt2 = new Date();
        //Date dt3 = new Date( 2, 7, 2025 );
    }
}