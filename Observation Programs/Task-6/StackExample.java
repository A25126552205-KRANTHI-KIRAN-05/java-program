package observation;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Java");
        stack.push("Python");
        stack.push("C++");

        System.out.println("Stack: " + stack);

        System.out.println("Top Element: " + stack.peek());

        System.out.println("Popped Element: " + stack.pop());
        System.out.println("After pop: " + stack);

        System.out.println("Is Empty: " + stack.empty());

        stack.push("HTML");
        stack.push("JavaScript");

        System.out.println("Stack: " + stack);

        System.out.println("Position of Java: " + stack.search("Java"));
    }
}