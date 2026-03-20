class Date{
    int day;
    int month;
    int year;

    Date( ){
        System.out.println("Inside constructor");
        this.day = day;
        this.month = month;
        this.year = year;
    }

}
class Program {
    public static void main1(String[] args) {
        Date dt = new Date(); //call implicitly only
        //dt.Date(); //Not ok => constructor doesn't call explicitly
    }  
    public static void main(String[] args) {
        Date dt = null; //constructor will not be call
        new Date(); //will be call on anonymous instance
    }    
}
