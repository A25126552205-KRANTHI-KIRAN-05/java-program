package observation;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {

        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java");

        System.out.println("LinkedHashSet: " + set);

        set.remove("Python");
        System.out.println("After remove: " + set);

        System.out.println("Contains Java: " + set.contains("Java"));

        System.out.println("Size: " + set.size());

        set.clear();

        System.out.println("After clear: " + set);
    }
}