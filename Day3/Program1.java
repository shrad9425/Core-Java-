import java.util.Date;

class Program1 {
    public static void main(String[] args) {
        Date date = new Date();
        int hour = date.getHours();
        int minute = date.getMinutes();
        int second = date.getSeconds();
        System.out.println(hour+": "+minute+": "+ second);
    } 
    public static void main1(String[] args) {
        Date date = new Date();
        int day = date.getDay();
        int month = date.getMonth()+1;
        int year =date.getYear()+1900;
        System.out.println(day + "/" + month + "/" + year);
    }    
}