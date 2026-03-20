class Program3 {
    private static int count = 0;
    public static void printRecord(){
        //error: illegal start of expression 
        //int count = 0;   //declared final but not static 
        count = count+1;
        System.out.println("Count   : "+count);
    }
    public static void main(String[] args) {
        Program3.printRecord(); //1
        Program3.printRecord(); //2
        Program3.printRecord(); //3
    }    
}
