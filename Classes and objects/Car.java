
// Instance methods
public class Car{
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;


//  Instance variable
    public void drive(){
        if(currentFuelInLiters<=0){
            System.out.println("Car  is out of fuel");
        }else if(currentFuelInLiters<5){
            System.out.println("car is in reserve mode please refuel");
            currentFuelInLiters--;
        }else{
            System.out.println("Car is driving");
            currentFuelInLiters--;
        }
    }
    public void  addFuel(float fuel){
        currentFuelInLiters += fuel;
    }

    public float getCurrentFuleLevel(){
        return currentFuelInLiters;
    }
    

    
}