package observation;
import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println("List: " + list);

        list.add(1, "HTML");
        System.out.println("After add(index): " + list);

        System.out.println("Element at index 2: " + list.get(2));

        list.set(2, "JavaScript");
        System.out.println("After set: " + list);

        list.remove(1);
        System.out.println("After remove(index): " + list);

        list.add("Java");

        System.out.println("Index of Java: " + list.indexOf("Java"));
        System.out.println("Last index of Java: " + list.lastIndexOf("Java"));

        System.out.println("SubList: " + list.subList(0, 2));

        list.sort(String::compareTo);
        System.out.println("After sort: " + list);
    }
}