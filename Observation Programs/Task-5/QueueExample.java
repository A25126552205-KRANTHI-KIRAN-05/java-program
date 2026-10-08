package observation;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Java");
        queue.offer("Python");
        queue.offer("C++");

        System.out.println("Queue: " + queue);

        System.out.println("Remove: " + queue.remove());
        System.out.println("After remove: " + queue);

        System.out.println("Poll: " + queue.poll());
        System.out.println("After poll: " + queue);

        System.out.println("Element: " + queue.element());
        System.out.println("Peek: " + queue.peek());
    }
}