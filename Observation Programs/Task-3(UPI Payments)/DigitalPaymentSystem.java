package observation;

interface PaymentService {

    void pay(String id, double value)
            throws InvalidUPIException,
                   InvalidAmountException,
                   InsufficientBalanceException;

    void checkBalance();
}

class Wallet {

    // Encapsulation
    private String name;
    private String mobile;
    private String upi;
    private double balance;

    // Constructor
    Wallet(String name, String mobile, String upi) {
        this.name = name;
        this.mobile = mobile;
        this.upi = upi;
        this.balance = 0;
    }

    public void addMoney(double value) throws InvalidAmountException {

        // Validate amount
        if (value <= 0) {
            throw new InvalidAmountException(
                    "Amount must be greater than zero."
            );
        }

        balance += value;
        System.out.println("₹" + value + " added successfully.");
    }

    public double getBalance() {
        return balance;
    }

    public void deductMoney(double value) {
        balance -= value;
    }

    public void displayWalletDetails() {
        System.out.println("\n----- Wallet Details -----");
        System.out.println("User Name     : " + name);
        System.out.println("Mobile Number : " + mobile);
        System.out.println("UPI ID        : " + upi);
        System.out.println("Balance       : ₹" + balance);
    }
}


// Custom exceptions
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class InvalidUPIException extends Exception {
    InvalidUPIException(String message) {
        super(message);
    }
}

class InvalidAmountException extends Exception {
    InvalidAmountException(String message) {
        super(message);
    }
}


class UPIPayment implements PaymentService {

    private Wallet wallet;

    UPIPayment(Wallet wallet) {
        this.wallet = wallet;
    }

    @Override
    public void pay(String id, double value)
            throws InvalidUPIException,
                   InvalidAmountException,
                   InsufficientBalanceException {

        // Validate UPI ID
        if (id == null || !id.contains("@")) {
            throw new InvalidUPIException("Invalid UPI ID.");
        }

        String[] data = id.split("@");

        if (data.length != 2 ||
            data[0].isEmpty() ||
            data[1].isEmpty()) {

            throw new InvalidUPIException("Invalid UPI ID format.");
        }

        // Validate payment amount
        if (value <= 0) {
            throw new InvalidAmountException(
                    "Payment amount must be greater than zero."
            );
        }

        // Check balance
        if (value > wallet.getBalance()) {
            throw new InsufficientBalanceException(
                    "Insufficient wallet balance."
            );
        }

        wallet.deductMoney(value);

        System.out.println("\nPayment Successful!");
        System.out.println("Paid To       : " + id);
        System.out.println("Amount        : ₹" + value);
        System.out.println("Remaining     : ₹" + wallet.getBalance());
    }

    @Override
    public void checkBalance() {
        System.out.println(
                "Available Balance: ₹" + wallet.getBalance()
        );
    }
}


public class DigitalPaymentSystem {

    public static void main(String[] args) {

        Wallet user = new Wallet(
                "Amith",
                "9876543210",
                "amith@upi"
        );

        UPIPayment transaction = new UPIPayment(user);

        try {
            user.addMoney(10000);

            transaction.checkBalance();

            transaction.pay("rahul@upi", 2500);

        } catch (InvalidUPIException e) {
            System.out.println(
                    "Transaction Failed: " + e.getMessage()
            );

        } catch (InvalidAmountException e) {
            System.out.println(
                    "Transaction Failed: " + e.getMessage()
            );

        } catch (InsufficientBalanceException e) {
            System.out.println(
                    "Transaction Failed: " + e.getMessage()
            );

        } finally {
            System.out.println("\nTransaction process completed.");
            user.displayWalletDetails();
        }
    }
}