
import java.util.Calendar;

class Program2 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int hr = cal.get(Calendar.HOUR);
        int min = cal.get(Calendar.MINUTE);
        int sec = cal.get(Calendar.SECOND);
        System.out.println(hr+":"+ min+":" + sec);
    }  
    public static void main1(String[] args) {
        Calendar cal = Calendar.getInstance();
        int day = cal.get(Calendar.DATE);
        int month = cal.get(Calendar.MONTH)+1;
        int year = cal.get(Calendar.YEAR);
        System.out.println(day+"/ "+ month+"/ " + year);
    }    
}
