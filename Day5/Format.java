class Name{
    String str;
    
    Name(String str){
        this.str = str;
        System.out.println(this.str);
    }
}

class Format {
    public static void main(String[] args) {
        String str = "hello";
        String s1 = new String( str );
        System.out.println(str+", "+s1);
        //Name name = new Name("hiii");
    }
}
