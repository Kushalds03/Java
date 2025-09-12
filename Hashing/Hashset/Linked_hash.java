import java.util.LinkedHashSet;

public class Linked_hash {
    public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("Bengaluru");
        cities.add("Hassan");
        cities.add("Mysuru");
        cities.add("Mandya");
        System.out.println(cities);// print in the order of the insertion 
    }
}
