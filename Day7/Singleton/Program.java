//Singleton class => a class which we can create only one instance
class Singleton{
    private Singleton( ){
        System.out.println("Inside costructor");
    }
    private static Singleton reference;
    public static Singleton getReference(){
        if (reference == null)
            reference = new Singleton();
        return reference;
    }
}
class Program{
    public static void main(String[] args) {
        Singleton s1 = Singleton.getReference();
        Singleton s2 = Singleton.getReference();
    }    
}
