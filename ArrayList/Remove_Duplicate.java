import java.util.*;
public class Remove_Duplicate {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(40);
        list.add(50);
        list.add(60);
        for(int i=0;i<list.size()-1;i++){
            for(int j = i+1;j<list.size();j++){
                if(list.get(i) == list.get(j)){
                        list.remove(j);
                        j--;
                }
            }


        }
        System.out.println(list);

        
    }
    
}
