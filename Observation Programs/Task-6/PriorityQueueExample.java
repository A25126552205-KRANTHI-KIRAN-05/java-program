package observation;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(40);
        queue.offer(10);
        queue.add(30);
        queue.offer(20);

        System.out.println("PriorityQueue: " + queue);

        System.out.println("Peek: " + queue.peek());

        System.out.println("Poll: " + queue.poll());
        System.out.println("After poll: " + queue);

        queue.remove(30);
        System.out.println("After remove(30): " + queue);

        System.out.println("Contains 20: " + queue.contains(20));

        System.out.println("Size: " + queue.size());
    }
}