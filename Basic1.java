import java.util.*;
public class Basic1{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(0));
        int n = list.get(list.size()-1);
        System.out.println(n);
        list.set(2,35);
        System.out.println(list);
        System.out.println(list.remove(Integer.valueOf(20)));
        System.out.println();

        
    }
}