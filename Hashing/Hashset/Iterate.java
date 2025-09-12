import java.util.HashSet;
import java.util.Iterator;
public class Iterate {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Bengaluru");
        cities.add("Hassan");
        cities.add("Mysuru");
        cities.add("Mandya");

        //iterator loop
        
        Iterator it = cities.iterator();
        while(it.hasNext()){    // loop will be run untill it has next element 
            System.out.println(it.next());  // both printing and iterate to next will happen in this function only
        }


       // advanced loop 
        for (String city : cities){
            System.out.println(city); 
        }


    }
    
}
