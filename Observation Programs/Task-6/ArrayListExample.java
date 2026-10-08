package observation;
import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println("ArrayList: " + list);

        list.add(1, "HTML");
        System.out.println("After add(index): " + list);

        System.out.println("Element at index 2: " + list.get(2));

        list.set(2, "JavaScript");
        System.out.println("After set: " + list);

        list.remove(1);
        System.out.println("After remove(index): " + list);

        list.remove("C++");
        System.out.println("After remove(Object): " + list);

        System.out.println("Contains Java: " + list.contains("Java"));
        System.out.println("Size: " + list.size());
        System.out.println("Is Empty: " + list.isEmpty());

        list.add("Java");
        System.out.println("Index of Java: " + list.indexOf("Java"));
        System.out.println("Last Index of Java: " + list.lastIndexOf("Java"));

        list.sort(Comparator.naturalOrder());
        System.out.println("After sort: " + list);

        list.clear();
        System.out.println("After clear: " + list);
    }
}