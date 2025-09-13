public class ExceptionPratice {

    static void methodC(){
        int[] arr = {1,2,3};
        System.out.println(arr[5]);
    }
    static void  methodB(){
        methodC();
    }
    static void methodA(){
        try {
            methodB();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The array is out of bound");
            System.out.println(e);
        
        }
    }
    public static void main(String[] args) {
        methodA();
    }
    
}
