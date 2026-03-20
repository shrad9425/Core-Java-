class Program2 {
    public static void printRecord(){
        int count =0;   //method local var
        count = count+1;
        System.out.println("Count   : "+count);
    }
    public static void main(String[] args) {
        Program2.printRecord(); //1
        Program2.printRecord(); //1
        Program2.printRecord(); //1
    }    
}
