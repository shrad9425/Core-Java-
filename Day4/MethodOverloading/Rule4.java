class Rule4{
    //only basis of return type => can not give same name to method
    static int sum(int num1, int num2){
        int result = num1 + num2;
        System.out.println("Result  : "+result);
    }
    static void sum(int num1, int num2){
        int result = num1 + num2;
        System.out.println("Result  : "+result);

    }
    public static void main(String[] args) {
        Rule4.sum(10,20);
        Rule4.sum(10,10);
    }
}