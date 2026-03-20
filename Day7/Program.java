class Program {
    public static double power(double base, int index){
        double result = 1;
        for (int i = 0; i <= index; i++) {
            result = result*base;
        }
        return result;
    }
    public static void main(String[] args) {
        double value = Program.power(2, 4);
        System.out.println("Result  : "+value);
    }    
}
