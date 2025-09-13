public class Pratice_Throws {

    static void fun() throws IllegalAccessException{
        System.out.println("Inside the fun().");
        throw new IllegalAccessException("demo");
    }


    public static void main(String[] args) {
        try {
            fun();
        } catch (IllegalAccessException e) {
            System.err.println("Catch in the main" );
        }
    }
    
}
