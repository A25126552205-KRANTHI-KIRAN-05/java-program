package observation;
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java");

        System.out.println("HashSet: " + set);

        set.remove("C++");
        System.out.println("After remove: " + set);

        System.out.println("Contains Java: " + set.contains("Java"));

        System.out.println("Size: " + set.size());

        System.out.println("Is Empty: " + set.isEmpty());

        set.clear();
        System.out.println("After clear: " + set);
    }
}