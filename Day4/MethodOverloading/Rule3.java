class Rule3{
    //if name of methods are same and passing parameters are also same => order of types of parameters must be different 
    static  void sum(int num1, float num2){
        float result = num1 + num2;
        System.out.println("Result  : "+result);
    }
    static void sum(float num1, int num2){
        float result = num1 + num2;
        System.out.println("Result  : "+result);

    }
    public static void main(String[] args) {
        Rule3.sum(10,20.5f);
        Rule3.sum(10.5f,10);
    }
}