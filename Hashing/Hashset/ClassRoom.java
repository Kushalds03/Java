import java.util.HashSet;
public class ClassRoom{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(1);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(40);
        System.out.println(set);

        if(set.contains(20)){
            System.out.println("Set containsn 2");
        }
        if(set.contains(30)){
            System.out.println("Set contains 3");
        }
        set.remove(1);
        System.out.println(set);
        System.out.println(set.size());
        set.clear();   // clear all the element in the set 
        System.out.println(set.size());
        System.out.println(set.isEmpty());  //return true/ false
    }
}