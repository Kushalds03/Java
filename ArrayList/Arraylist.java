
import java.util.ArrayList;
import java.util.Collections;
public class Arraylist{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        //Add elements;
        list.add(0);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(1,6);
        System.out.println(list);

        //Get elkements;
       int element =  list.get(0);
       System.out.println(element);


       // add element in between
       list.add(2,4);
       System.out.println(list);
       
       // Set element which will replace the element
       list.set(1,5);
       System.out.println(list); // in the place of the index 1 it changes the value from teh 2 to 5

       //delete element
       list.remove(3);  // remove which is present in the 3rd index
       System.out.println(list);


       int size = list.size();
       System.out.println(size);

      // contains
       System.out.println(list.contains(3));    

       for(int i = 0; i<list.size(); i++){
    System.out.print(list.get(i) + " ");
       }
    //   reverse 
    for(int i = list.size()-1 ; i>=0;i--){
        System.out.print(list.get(i) + " ");
    }


        //sort
         Collections.sort(list);
        System.out.println(list);

       }
    }
