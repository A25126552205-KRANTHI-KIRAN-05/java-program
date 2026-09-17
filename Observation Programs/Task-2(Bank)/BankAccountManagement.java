package observation;

class Account {

    // Account attributes
    protected int accNo;
    protected String holder;
    protected double amount;
    protected String type;

    // Constructor
    Account(int accNo, String holder, double amount, String type) {
        this.accNo = accNo;
        this.holder = holder;
        this.amount = amount;
        this.type = type;
    }

    // Deposit money
    public void deposit(double value) {
        if (value > 0) {
            amount += value;
            System.out.println("₹" + value + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw money
    public void withdraw(double value) {
        if (value > 0 && value <= amount) {
            amount -= value;
            System.out.println("₹" + value + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Transfer money
    public void transfer(Account receiver, double value) {
        if (value > 0 && value <= amount) {
            amount -= value;
            receiver.amount += value;

            System.out.println("₹" + value + " transferred successfully.");
        } else {
            System.out.println("Transfer failed.");
        }
    }

    // Display account details
    public void displayAccountDetails() {
        System.out.println("\n----- Account Details -----");
        System.out.println("Account Number : " + accNo);
        System.out.println("Holder Name    : " + holder);
        System.out.println("Account Type   : " + type);
        System.out.println("Balance        : ₹" + amount);
    }
}


class SavingsAccount extends Account {

    private double rate;

    // Constructor
    SavingsAccount(int accNo, String holder,
                   double amount, double rate) {

        super(accNo, holder, amount, "Savings");
        this.rate = rate;
    }

    // Calculate interest
    public void calculateInterest() {
        double interest = amount * rate / 100;
        amount += interest;

        System.out.println("Interest added: ₹" + interest);
    }
}


class CurrentAccount extends Account {

    private double limit;

    // Constructor
    CurrentAccount(int accNo, String holder,
                   double amount, double limit) {

        super(accNo, holder, amount, "Current");
        this.limit = limit;
    }

    // Method overriding
    @Override
    public void withdraw(double value) {

        if (value > 0 && value <= amount + limit) {
            amount -= value;

            System.out.println(
                    "₹" + value + " withdrawn successfully."
            );
        } else {
            System.out.println(
                    "Withdrawal exceeds overdraft limit."
            );
        }
    }
}


public class BankAccountManagement {

    public static void main(String[] args) {

        // Creating account objects
        SavingsAccount savings = new SavingsAccount(
                1001, "Abhishek", 10000, 5
        );

        CurrentAccount current = new CurrentAccount(
                1002, "Rahul", 5000, 3000
        );

        System.out.println("INITIAL ACCOUNT DETAILS");

        savings.displayAccountDetails();
        current.displayAccountDetails();

        // Performing transactions
        System.out.println("\n----- Transactions -----");

        savings.deposit(2000);

        savings.withdraw(1000);

        savings.calculateInterest();

        current.deposit(3000);

        current.withdraw(9000);

        savings.transfer(current, 2000);

        System.out.println("\nFINAL ACCOUNT DETAILS");

        savings.displayAccountDetails();
        current.displayAccountDetails();
    }
}