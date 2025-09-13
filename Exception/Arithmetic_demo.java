class Arithmetic_demo{
    public static void main(String[] args) {
        try{
            int a = 30;
            int b = 0;
            int div = a/b;
            System.out.println("The division of the number is " +div);
        }catch(ArithmeticException e){
            System.out.println("Can't divide a number by 0");
        }
    }
}