public class Narrowing {
    public static void main(String[] args) {
        //narrowing conversion double -> float -> long -> int -> short -> byte & double -> float -> long -> int -> char
     
        double c = 9.78;
        float f = (float)c; // double to float
        System.out.println(f);

        long l = (long)c;
        System.out.println(l); // double to long

        int d = (int) c;
        System.out.println(d); // double to int

        float f1 = 8.81f;
        long l1 = (long)f1; // float to long
        System.out.println(l1);

        int i1 = (int)f1;
        System.out.println(i1); // float to int

        long l3 = 400000;
        int i3 = (int) l3; //long to int
        System.out.println(i3);

        int i4 = 200;
        short s = (short)i4; // int to short
        System.out.println(s);

        int i5 = 65;
        char ch = (char)i5; //int to char
        System.out.println(ch);

        short s1 = 100;
        byte b =(byte) s1; // short to byte
        System.out.println(b);

    }
    
}
