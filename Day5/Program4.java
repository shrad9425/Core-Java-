class Test{
  int num = 10;

  {
    this.num = 23;  //instance initalization block
  }
  Test( ){
    this.num = 30;
  }
   
  void printRecord(){
    System.out.println("Num : "+num);
  }
}
class Program4 {
    public static void main(String[] args) {
        Test t = new Test( );
        t.printRecord();
    }    
}
