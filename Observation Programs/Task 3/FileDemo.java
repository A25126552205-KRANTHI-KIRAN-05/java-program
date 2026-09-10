package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) {
        try {
            File file = new File("student.txt");

            Scanner sc = new Scanner(file);

            System.out.println(sc.nextLine());

            sc.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}