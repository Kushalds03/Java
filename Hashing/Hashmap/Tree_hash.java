import java.util.TreeMap;
public class Tree_hash {
    public static void main(String[] args) {
        TreeMap<String,Integer> tm = new TreeMap<>();
        tm.put("India",100);
        tm.put("China",150);
        tm.put("Us",120);
        tm.put("Indonesia",130);
        System.out.println(tm);  //output is coming based on the alphabetical order

    }
}
