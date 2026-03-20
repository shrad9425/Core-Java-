
class Date{
  int day;
  int month;
  int year;

  Date(  ){ 
    this(16, 11, 2025); //constructor chaining
  }
  Date( int day, int month, int year ){ //Constructor
    this.day = day;
    this.month = month;
    this.year = year;
    
  }
  void printRecord(){
    System.out.println(this.day+"/"+this.month+"/"+this.year);
  }
}
class Program3{
  public static void main(String[] args) {
    Date dt1 = new Date(  );
    dt1.printRecord();  //16/11/2025

    Date dt2 = new Date( 13,9,2003);
    dt2.printRecord();  //13/9/2003
  }
}