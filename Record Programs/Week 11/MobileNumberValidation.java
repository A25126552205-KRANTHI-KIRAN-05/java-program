package labprograms;
import java.util.Scanner;

class LengthNotSufficientException extends Exception {

    LengthNotSufficientException(String message) {
        super(message);
    }
}

public class MobileNumberValidation {

    static void validateMobileNumber(String number)
            throws LengthNotSufficientException {

        try {

            if (number.length() > 10) {
                throw new ArrayIndexOutOfBoundsException();
            }

            if (number.length() < 10) {
                throw new LengthNotSufficientException(
                        "Invalid Mobile Number - LengthNotSufficientException");
            }

            for (int i = 0; i < number.length(); i++) {

                if (!Character.isDigit(number.charAt(i))) {
                    throw new NumberFormatException();
                }
            }

            System.out.println("Valid number");

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(
                    "Invalid Mobile Number - ArrayIndexOutOfBounds Exception");

        } catch (LengthNotSufficientException e) {

            System.out.println(e.getMessage());

        } catch (NumberFormatException e) {

            System.out.println(
                    "Invalid Mobile Number - NumberFormatException");

        } finally {

            System.out.println("Validation completed.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mobile number: ");
        String number = sc.nextLine();

        try {
            validateMobileNumber(number);
        } catch (LengthNotSufficientException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}