
class Date{
  int day;
  int month;
  int year;

  Date(  ){ 
    this.setDate(13,9,2003);
  }
  Date( int day, int month, int year ){ //Constructor
    this.setDate(day,month,year);
    
  }
  void setDate(int day, int month, int year){
    this.day = day;
    this.month = month;
    this.year = year;
  }
  void printRecord(){
    System.out.println(this.day+"/"+this.month+"/"+this.year);
  }
}
class Program2{
  public static void main(String[] args) {
    Date dt1 = new Date( 13,4,2023 );
    dt1.printRecord();  //13/4/2023

    Date dt2 = new Date( );
    dt2.printRecord();  //13/9/2003
  }
}