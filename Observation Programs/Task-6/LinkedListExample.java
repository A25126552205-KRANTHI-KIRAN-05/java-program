package observation;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println("LinkedList: " + list);

        list.addFirst("HTML");
        list.addLast("JavaScript");

        System.out.println("After addFirst/addLast: " + list);

        System.out.println("Element at index 2: " + list.get(2));

        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());

        list.remove(2);
        System.out.println("After remove(index): " + list);

        list.remove("Python");
        System.out.println("After remove(Object): " + list);

        System.out.println("Removed First: " + list.removeFirst());
        System.out.println("After removeFirst: " + list);

        System.out.println("Removed Last: " + list.removeLast());
        System.out.println("After removeLast: " + list);

        list.offer("C");
        System.out.println("After offer: " + list);

        System.out.println("Poll: " + list.poll());
        System.out.println("After poll: " + list);

        System.out.println("Peek: " + list.peek());
    }
}