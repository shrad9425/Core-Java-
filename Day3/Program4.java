
import java.time.LocalDate;

class Program4 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        //System.out.println("Current Date: " + ld);
        
        int day = ld.getDayOfMonth();
        int month = ld.getMonthValue();
        int year = ld.getYear();
        System.out.println(day + "-" + month + "-" + year );
    }    
}
