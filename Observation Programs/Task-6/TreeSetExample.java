package observation;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(40);
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(50);

        System.out.println("TreeSet: " + set);

        set.remove(30);
        System.out.println("After remove: " + set);

        System.out.println("Contains 20: " + set.contains(20));

        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());

        System.out.println("Higher than 20: " + set.higher(20));
        System.out.println("Lower than 40: " + set.lower(40));

        System.out.println("Ceiling of 25: " + set.ceiling(25));
        System.out.println("Floor of 25: " + set.floor(25));

        System.out.println("Poll First: " + set.pollFirst());
        System.out.println("After pollFirst: " + set);

        System.out.println("Poll Last: " + set.pollLast());
        System.out.println("After pollLast: " + set);
    }
}