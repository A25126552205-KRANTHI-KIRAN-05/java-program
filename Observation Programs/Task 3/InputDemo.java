package exceptionhandling;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter your age:");
            int age = sc.nextInt();

            System.out.println("Age: " + age);
        }
        catch (java.util.InputMismatchException e) {
            System.out.println("Please enter a valid number");
        }
    }
}