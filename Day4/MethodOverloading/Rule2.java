class Rule2{
    //if name of methods are same and passing parameters are also same => type of atleat one parameter must be different 
    static void sum(int num1, int num2){
        int result = num1 + num2;
        System.out.println("Result  : "+result);
    }
    static void sum(int num1, float num2){
        float result = num1 + num2;
        System.out.println("Result  : "+result);

    }
    public static void main(String[] args) {
        Rule2.sum(10,20);
        Rule2.sum(10,20.5f);
    }
}