import java.util.InputMismatchException;
import java.util.Scanner;

class Demo {
    Scanner sc = new Scanner(System.in);

    void method() {
        int x;
        int y;
        System.out.println("Enter the value of x: ");
        x = sc.nextInt();
        System.out.println("Enter the value of y: ");
        y = sc.nextInt();
        try {
            int z = x / y;
            System.out.println("z = " + z);
        } catch (ArithmeticException ae) {
            System.out.println("The value you entered for y is wrong");
            System.out.println("Enter the correct value for y: ");
            y = sc.nextInt();
            int z = x / y;
            System.out.println("z = " + z);
        } catch (InputMismatchException ime) {
            sc.next();
            System.out.println("Enter the correct value of y: ");
            y = sc.nextInt();
            int z = x/y;
            System.out.println("z = "+z);  
        }

    }

}

public class TryWithMultipleCatch {
    public static void main() {
        Demo d = new Demo();
        d.method();
    }
}
