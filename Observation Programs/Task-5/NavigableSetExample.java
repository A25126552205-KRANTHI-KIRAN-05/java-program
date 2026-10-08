package observation;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetExample {
    public static void main(String[] args) {

        NavigableSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        System.out.println("NavigableSet: " + set);

        System.out.println("Lower than 30: " + set.lower(30));
        System.out.println("Floor of 30: " + set.floor(30));
        System.out.println("Ceiling of 35: " + set.ceiling(35));
        System.out.println("Higher than 30: " + set.higher(30));

        System.out.println("Poll First: " + set.pollFirst());
        System.out.println("After pollFirst: " + set);

        System.out.println("Poll Last: " + set.pollLast());
        System.out.println("After pollLast: " + set);

        System.out.println("Descending Set: " + set.descendingSet());
    }
}