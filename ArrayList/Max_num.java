
import java.util.ArrayList;

public class Max_num {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        int max = Integer.MIN_VALUE;
        for(int i  = 0;i<list.size();i++){
            // if(list.get(i)>max){
            //     max = list.get(i);
            // }  
            //   OR
            max = Math.max(list.get(i), max);
        }
        System.out.println("The maximum value in the Arraylist is "+max);
    }
    
}
