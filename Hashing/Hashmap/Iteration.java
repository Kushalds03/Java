import java.util.*;
public class Iteration {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India",10000000);
        hm.put("China",150000000);
        hm.put("US",10200000);

        // iterate
        //hm.entryset()
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("Key: " + k +", Values: " + hm.get(k));
            
        }

    }
    


   
}
