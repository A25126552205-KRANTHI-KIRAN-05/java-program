package observation;
import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java");

        System.out.println("Set: " + set);

        set.remove("C++");
        System.out.println("After remove: " + set);

        System.out.println("Contains Java: " + set.contains("Java"));

        System.out.println("Size: " + set.size());
        System.out.println("Is Empty: " + set.isEmpty());

        set.clear();

        System.out.println("After clear: " + set);
    }
}