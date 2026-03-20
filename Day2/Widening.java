class Widening {
    public static void main(String[] args) {
        //widening conversion byte -> short -> int -> long -> float -> double

        int a = 10;
        long l = (long) a;
        System.out.println(l); //int to long
        
      
        byte num = 11;
        short s1 = (short)num;
        System.out.println(s1);  //byte to short

        char ch = 'B';
        int i = (int)ch;
        System.out.println(i); //char to int
   
        short sh = 12;
        int i1 = (int )sh;
        System.out.println(i1); //short to int

        long l4 = 123456;
        float f5 = (float)l4;
        System.out.println(f5); //long to float

        float f4 = 13.13f;
        double d4 = (double) f4;
        System.out.println(d4); //float to double 

    }
}
