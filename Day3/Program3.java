import java.text.SimpleDateFormat;
import java.util.Date;

class Program3 {
    public static void main(String[] args) {
        //SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        SimpleDateFormat sdf = new SimpleDateFormat("EEE dd/MMM/yyyy");
        //Date formats :
        Date date = new Date();
        System.out.println(sdf.format(date));
    }
}
