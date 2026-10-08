package labprograms;
import java.util.Scanner;

interface Employee {
    void calculateSalary();
}

interface SalaryDetails extends Employee {
    void displaySalary();
}

class RegularEmployee implements SalaryDetails {
    private String employeeId;
    private double basicPay = 25000;
    private double hra = 15000;
    private double ta = 5000;

    RegularEmployee(String employeeId) {
        this.employeeId = employeeId;
    }

    public void calculateSalary() {
        double total = basicPay + hra + ta;

        System.out.println("Salary Details:");
        System.out.println("Employee Id: " + employeeId);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("HRA: " + hra);
        System.out.println("T.A: " + ta);
        System.out.println("Total Amount: " + total);
    }

    public void displaySalary() {
        calculateSalary();
    }
}

class ContractEmployee implements SalaryDetails {
    private String employeeId;
    private double basicPay = 12000;
    private double hra = 0;
    private double ta = 3000;

    ContractEmployee(String employeeId) {
        this.employeeId = employeeId;
    }

    public void calculateSalary() {
        double total = basicPay + hra + ta;

        System.out.println("Salary Details:");
        System.out.println("Employee Id: " + employeeId);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("HRA: " + hra);
        System.out.println("T.A: " + ta);
        System.out.println("Total Amount: " + total);
    }

    public void displaySalary() {
        calculateSalary();
    }
}

public class EmployeePayroll {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Id: ");
        String employeeId = sc.nextLine();

        SalaryDetails employee;

        if (employeeId.toUpperCase().startsWith("R")) {
            employee = new RegularEmployee(employeeId);
        } 
        else if (employeeId.toUpperCase().startsWith("C")) {
            employee = new ContractEmployee(employeeId);
        } 
        else {
            System.out.println("Invalid Employee Id");
            sc.close();
            return;
        }

        employee.displaySalary();

        sc.close();
    }
}