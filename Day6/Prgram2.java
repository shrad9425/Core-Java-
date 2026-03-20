//must provide value to final field either inside constructor or at the initailzation/time of declaration 
class Test{
    private final int num =10;

    void showRecord(){
        System.out.println("Num : "+this.num);
    }
    void printRecord(){
        System.out.println("Num : "+this.num);
    }
}
class Prgram2 {
    public static void main(String[] args) {
        Test t = new Test();
        t.showRecord();     //10
        t.printRecord();    //10
    }    
}
