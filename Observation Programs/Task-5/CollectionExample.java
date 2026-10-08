package observation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionExample {
    public static void main(String[] args) {

        Collection<String> c1 = new ArrayList<>();

        c1.add("Java");
        c1.add("Python");
        c1.add("C++");

        Collection<String> c2 = new ArrayList<>();
        c2.add("JavaScript");
        c2.add("HTML");

        System.out.println("Collection: " + c1);

        c1.addAll(c2);
        System.out.println("After addAll: " + c1);

        c1.remove("C++");
        System.out.println("After remove: " + c1);

        System.out.println("Contains Java: " + c1.contains("Java"));
        System.out.println("Contains all c2: " + c1.containsAll(c2));

        c1.removeAll(c2);
        System.out.println("After removeAll: " + c1);

        System.out.println("Size: " + c1.size());
        System.out.println("Is Empty: " + c1.isEmpty());

        Iterator<String> it = c1.iterator();

        System.out.println("Using Iterator:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        c1.clear();
        System.out.println("After clear: " + c1);
    }
}