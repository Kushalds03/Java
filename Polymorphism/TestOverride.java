class Person{
    void role(){
        System.out.println("I am a person");
         
    }
}
class Father extends Person{
    @Override
    void role(){
        System.out.println("I am a Father");
    }
}



public class TestOverride{
    public static void main(String[] args) {
        Person p = new Father(); // Upcasting 
        Person pa = new Person();
        // Father fa = new Person();  // Downcasting 
        p.role();
        pa.role();
        // fa.role();

        // Downcasting explictly
        Father f = (Father)p;
        f.role();
           
    }
    
}