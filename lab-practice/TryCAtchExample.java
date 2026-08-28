import java.util.Scanner;

class Sample {
    Scanner sc = new Scanner(System.in);

    void Example() {
        int x;
        System.out.println("Enter the value of x: ");
        x = sc.nextInt();
        int y;
        System.out.println("Enter the value of y: ");
        y = sc.nextInt();

        try {
            int z = x / y;
            System.out.println("z= " + z);
        } 
        catch (ArithmeticException ae) {
            System.out.println("Enter value of y must be grater than 0: ");
            y = sc.nextInt();
            int z = x / y;
            System.out.println("z= " + z);
        }
    }
}

public class TryCAtchExample {
    public static void main(String[] args) {
        Sample s = new Sample();
        s.Example();
    }

}
