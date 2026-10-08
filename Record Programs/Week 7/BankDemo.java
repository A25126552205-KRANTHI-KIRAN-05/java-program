package labprograms;
import java.util.Scanner;

class Customer {
    String name;
    int customerId;

    Customer(String name, int customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    void displayCustomer() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer ID: " + customerId);
    }
}

class Account {
    int accountNumber;
    double balance;
    Customer customer;

    Account(int accountNumber, double balance, Customer customer) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customer = customer;
    }

    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class RBI {
    double rateOfInterest = 4.0;

    double getRateOfInterest() {
        return rateOfInterest;
    }
}

class SBI extends RBI {
    SBI() {
        rateOfInterest = 7.0;
    }
}

class ICICI extends RBI {
    ICICI() {
        rateOfInterest = 6.5;
    }
}

class PNB extends RBI {
    PNB() {
        rateOfInterest = 6.0;
    }
}

public class BankDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Bank name to find the rate of Interest : ");
        String bankName = sc.nextLine();

        RBI bank;

        if (bankName.equalsIgnoreCase("RBI")) {
            bank = new RBI();
        } 
        else if (bankName.equalsIgnoreCase("SBI")) {
            bank = new SBI();
        } 
        else if (bankName.equalsIgnoreCase("ICICI")) {
            bank = new ICICI();
        } 
        else if (bankName.equalsIgnoreCase("PNB")) {
            bank = new PNB();
        } 
        else {
            System.out.println("Invalid Bank Name");
            sc.close();
            return;
        }

        System.out.println("RBI rate of interest is : "
                + bank.getRateOfInterest() + "%");

        sc.close();
    }
}