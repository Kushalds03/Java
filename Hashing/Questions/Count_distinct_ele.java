import java.util.*;
public class Count_distinct_ele{
    public static void main(String args[]){
        int num[] = { 4,3,2,5,6,7,3,4,2,1};
        HashSet<Integer> set =  new HashSet<>();
        int n = num.length;
        for(int i = 0;i<n;i++){
            
            set.add(num[i]);

            
        }
        System.out.println(set.size());
    }
}