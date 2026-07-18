import java.util.*;
public class Second_Largets{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(40);
        list.add(20);
        list.add(60);
        list.add(30);
        list.add(50);
        int largetst = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for(int i = 0;i<list.size();i++){
            if(list.get(i)>largetst){
                secondlargest = largetst;
                largetst = list.get(i);
            
            }else if(list.get(i)>secondlargest && list.get(i)!=largetst){
                secondlargest = list.get(i);
            }
        }
        System.out.println(secondlargest);

    }
}