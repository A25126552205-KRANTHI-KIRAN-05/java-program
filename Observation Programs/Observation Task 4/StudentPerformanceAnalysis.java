package observation;
import java.util.Scanner;

class Student {

    private int rollNumber;
    private String studentName;
    private int[] marks;

    Student(int rollNumber, String studentName, int[] marks) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.marks = marks;
    }

    int calculateTotal() {
        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        return total;
    }

    double calculateAverage() {
        return (double) calculateTotal() / marks.length;
    }

    int findHighest() {
        int highest = marks[0];

        for (int mark : marks) {
            highest = Math.max(highest, mark);
        }

        return highest;
    }

    int findLowest() {
        int lowest = marks[0];

        for (int mark : marks) {
            lowest = Math.min(lowest, mark);
        }

        return lowest;
    }

    double calculatePercentage() {
        double percentage = ((double) calculateTotal() / (marks.length * 100)) * 100;

        return Math.round(percentage * 100.0) / 100.0;
    }

    String calculateGrade() {
        double percentage = calculatePercentage();

        if (percentage >= 90)
            return "A+";
        else if (percentage >= 80)
            return "A";
        else if (percentage >= 70)
            return "B";
        else if (percentage >= 60)
            return "C";
        else if (percentage >= 50)
            return "D";
        else
            return "F";
    }

    String getResult() {
        if (calculatePercentage() >= 50)
            return "PASS";
        else
            return "FAIL";
    }

    String getRemark() {
        String grade = calculateGrade();

        switch (grade) {
            case "A+":
                return "Excellent Performance";
            case "A":
                return "Very Good Performance";
            case "B":
                return "Good Performance";
            case "C":
                return "Average Performance";
            case "D":
                return "Satisfactory Performance";
            default:
                return "Needs Improvement";
        }
    }

    void displayDetails() {

        String formattedName = studentName.trim().toUpperCase();

        System.out.println("\n========== STUDENT PERFORMANCE REPORT ==========");
        System.out.println("Roll Number       : " + rollNumber);
        System.out.println("Student Name      : " + formattedName);
        System.out.println("Name Length       : " + formattedName.length());

        System.out.println("\nSubject Marks:");

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + "         : " + marks[i]);
        }

        System.out.println("\nTotal Marks       : " + calculateTotal());
        System.out.printf("Average Marks     : %.2f%n", calculateAverage());
        System.out.println("Highest Marks     : " + findHighest());
        System.out.println("Lowest Marks      : " + findLowest());
        System.out.printf("Percentage        : %.2f%%%n", calculatePercentage());
        System.out.println("Grade             : " + calculateGrade());
        System.out.println("Result            : " + getResult());
        System.out.println("Performance Remark: " + getRemark());

        System.out.println("===============================================");
    }
}

public class StudentPerformanceAnalysis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== STUDENT PERFORMANCE ANALYSIS SYSTEM =====");

        System.out.print("Enter Roll Number: ");
        int rollNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();

        int[] marks = new int[5];

        System.out.println("Enter marks for 5 subjects:");

        for (int i = 0; i < marks.length; i++) {

            while (true) {
                System.out.print("Subject " + (i + 1) + ": ");
                int mark = sc.nextInt();

                if (mark >= 0 && mark <= 100) {
                    marks[i] = mark;
                    break;
                } else {
                    System.out.println("Invalid marks! Enter marks between 0 and 100.");
                }
            }
        }

        Student student = new Student(rollNumber, studentName, marks);

        student.displayDetails();

        sc.close();
    }
}