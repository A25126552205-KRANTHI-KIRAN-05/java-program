package exceptionhandling;
import java.io.FileReader;
import java.io.IOException;

public class IODemo {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("student.txt");

            int data = file.read();

            System.out.println((char) data);

            file.close();
        }
        catch (IOException e) {
            System.out.println("Input or output error");
        }
    }
}