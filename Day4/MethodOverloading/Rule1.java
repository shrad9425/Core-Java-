class Rule1{
    //if name of methods are same and their type of parameters are also same => no.of parameters should be different 
    static void sum(int num1, int num2){
        int result = num1 + num2;
        System.out.println("Result  : "+result);
    }
    static void sum(int num1, int num2, int num3){
        int result = num1 + num2+ num3;
        System.out.println("Result  : "+result);

    }
    public static void main(String[] args) {
        Rule1.sum(10,20);
        Rule1.sum(10,20,30);
    }
}