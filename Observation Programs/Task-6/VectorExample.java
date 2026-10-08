package observation;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();

        vector.add("Java");
        vector.add("Python");
        vector.add("C++");

        System.out.println("Vector: " + vector);

        vector.addElement("HTML");
        System.out.println("After addElement: " + vector);

        System.out.println("Element at index 1: " + vector.get(1));

        vector.set(1, "JavaScript");
        System.out.println("After set: " + vector);

        vector.remove(2);
        System.out.println("After remove(index): " + vector);

        vector.removeElement("HTML");
        System.out.println("After removeElement: " + vector);

        System.out.println("Size: " + vector.size());
        System.out.println("Capacity: " + vector.capacity());

        System.out.println("Contains Java: " + vector.contains("Java"));
    }
}