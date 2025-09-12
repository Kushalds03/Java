import java.util.*;
public class  class1{
    public static void main(String args[]){
        HashMap<String,Integer> hm = new HashMap<>();
        // insert  - O(1)
        hm.put("India",10000000);
        hm.put("China",150000000);
        hm.put("US",10200000);
        System.out.println(hm);

        // get -O(1)
        int population = hm.get("India");   // we will get a value of the key india 
        // int population2 = hm.get("russia");   if key is not present then it will return the null value
        System.out.println(population);
        // System.out.println(population2);


        // containsKey  - O(1)

        System.out.println(hm.containsKey("India"));   
        System.out.println(hm.containsKey("Russia"));  // return false

        // remove 
        hm.remove("US");
        System.out.println(hm);

        // size
        System.out.println(hm.size());

       //Is Empty
       System.out.println(hm.isEmpty()); // it will give us false 

       // hm.clear;
       hm.clear();
       System.out.println(hm.isEmpty());    //  it will give us true 

    }
}
