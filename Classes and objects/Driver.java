public class Driver {
    public static void main(String[] args) {
        Car myCar  = new Car(); //object creation  mycar is refernce new car() is object   
        myCar.addFuel(5);
        myCar.drive(); 
        myCar.drive(); 
        myCar.drive(); 
        myCar.drive(); 
        myCar.addFuel(5);
        System.out.println(myCar.getCurrentFuleLevel());
    }
    
}
