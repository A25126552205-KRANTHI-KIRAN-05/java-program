package observation;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void main(String[] args) {

        SortedSet<Integer> set = new TreeSet<>();

        set.add(40);
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(50);

        System.out.println("SortedSet: " + set);

        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());

        System.out.println("HeadSet(30): " + set.headSet(30));
        System.out.println("TailSet(30): " + set.tailSet(30));
        System.out.println("SubSet(20, 50): " + set.subSet(20, 50));

        System.out.println("Comparator: " + set.comparator());
    }
}