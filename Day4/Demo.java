
class Date{
    int day, month, year; //null

    void acceptRecord(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;  
    }
    void displayRecord(){
        System.out.println("Date: "+day+"/"+month+"/"+year);
    }
}
class Demo {
    public static void main(String[] args) {
        Date dt= new Date(); 
        //dt.acceptRecord(13, 9,2003);  //13-9-2003
        dt.acceptRecord(14, 11, 2025);  //14-11-2025
        dt.displayRecord();
   } 
}
