package javacore;

import java.util.Scanner;

public class studentUtility {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int choice;
		do {
			System.out.println("studentUtility program");
			System.out.println("1.Student Information");
			System.out.println("2.Conditional Statements");
			System.out.println("3.Looping Statements");
			System.out.println("4.Utility methods");
			System.out.println("5.Exit");
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter Name:");
				sc.nextLine();
				String name=sc.nextLine();
				System.out.println("Enter the Roll Number:");
				int roll =sc.nextInt();
				System.out.println("Enter Marks in 3 subjects");
				int m1=sc.nextInt(),m2=sc.nextInt(),m3=sc.nextInt();
				int total=m1+m2+m3;
			 double	percentage =(total/3)*100;
				System.out.println("\n--- Student Result ---");
                System.out.println("Name: " + name);
                System.out.println("Roll No: " + roll);
                System.out.println("Total Marks: " + total);
                System.out.println("Percentage: " + percentage + "%");
                break;
                
			case 2:
				System.out.println("\n Conditional Statement");
				 System.out.println("1. Even or Odd");
                 System.out.println("2. Largest of Three Numbers");
                 System.out.println("3. Grade based on Percentage");
                 System.out.println("4. Day of the Week");
                 int condChoice = sc.nextInt();

                 switch (condChoice) {
                     case 1:
                         System.out.print("Enter a number: ");
                         int num = sc.nextInt();
                         System.out.println(num % 2 == 0 ? "Even" : "Odd");
                         break;
                     case 2:
                         System.out.print("Enter three numbers: ");
                         int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
                         int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
                         System.out.println("Largest: " + largest);
                         break;
                     case 3:
                         System.out.print("Enter percentage: ");
                         double per = sc.nextDouble();
                         if (per >= 90) System.out.println("Grade: A+");
                         else if (per >= 75) System.out.println("Grade: A");
                         else if (per >= 60) System.out.println("Grade: B");
                         else if (per >= 40) System.out.println("Grade: C");
                         else System.out.println("Grade: Fail");
                         break;
                     case 4:
                         System.out.print("Enter day number (1-7): ");
                         int day = sc.nextInt();
                         switch (day) {
                             case 1: System.out.println("Monday"); break;
                             case 2: System.out.println("Tuesday"); break;
                             case 3: System.out.println("Wednesday"); break;
                             case 4: System.out.println("Thursday"); break;
                             case 5: System.out.println("Friday"); break;
                             case 6: System.out.println("Saturday"); break; 
                             case 7: System.out.println("Sunday"); break;
                             default: System.out.println("Invalid day!");
                         }
                         break;
                 }
                 break;
			case 3: // Part C
                System.out.println("\n--- Looping Statements  ---");
                System.out.println("1. Multiplication Table");
                System.out.println("2. Display numbers 1 to N");
                System.out.println("3. Sum of first N natural numbers");
                System.out.println("4. Fibonacci Series");
                int loopChoice = sc.nextInt();

                switch (loopChoice) {
                    case 1:
                        System.out.print("Enter number: ");
                        int n = sc.nextInt();
                        for (int i = 1; i <= 10; i++)
                            System.out.println(n + " x " + i + " = " + (n * i));  
                        break;
                    case 2:
                        System.out.print("Enter N: ");
                        int N = sc.nextInt();
                        for (int i = 1; i <= N; i++) System.out.print(i + " ");
                        System.out.println();
                        break;
                    case 3:
                        System.out.print("Enter N: ");
                        int numN = sc.nextInt();
                        int sum = 0;
                        for (int i = 1; i <= numN; i++) sum += i;
                        System.out.println("Sum = " + sum);
                        break;
                    case 4:
                        System.out.print("Enter terms: ");
                        int terms = sc.nextInt();
                        int f1 = 0, f2 = 1;
                        System.out.print("Fibonacci: " + f1 + " " + f2);
                        for (int i = 3; i <= terms; i++) {
                            int next = f1 + f2;
                            System.out.print(" " + next);
                            f1 = f2;
                            f2 = next;
                        }
                        System.out.println();
                        break;
                }
                break;
			case 4: // Part D
                System.out.println("\n--- Methods ---");
                System.out.println("1. Factorial");
                System.out.println("2. Prime Check");
                System.out.println("3. Max of Two Numbers");
                System.out.println("4. Area of Circle");
                int methodChoice = sc.nextInt();
                
                switch (methodChoice) {
                case 1:
                	 
                    System.out.println("Enter number: ");
                    int factNum = sc.nextInt();
                    System.out.println("Factorial = " + factorial(factNum));
                    break;
                case 2:
                	

                    System.out.println("Enter number: ");
                    int primeNum = sc.nextInt();
                    
                    System.out.println(isPrime(primeNum) ? "Prime" : "Not Prime");
                    break;
                case 3:
                    System.out.print("Enter two numbers: ");
                    int x = sc.nextInt(), y = sc.nextInt();
                    System.out.println("Max = " + maxOfTwo(x, y));
                    break;
                case 4:
                	System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    System.out.println("Area = " + areaOfCircle(r));
                    break;
            }
                               break;

            case 0:
                System.out.println("Exiting program...");
                break;

            default:
                System.out.println("Invalid choice!");
        }
    } while (choice != 0);

    sc.close();
}
	 public static long factorial(int n) {
	        long fact = 1;
	        for (int i = 1; i <= n; i++) {
	            fact *= i;
	        }
	        return fact;
	    }

	    public static boolean isPrime(int n) {
	        if (n <= 1)
	            return false;

	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0)
	                return false;
	        }
	        return true;
	    }

	    public static int maxOfTwo(int a, int b) {
	        return (a > b) ? a : b;
	    }

	    public static double areaOfCircle(double r) {
	        return Math.PI * r * r;
	    }
	}

	 
