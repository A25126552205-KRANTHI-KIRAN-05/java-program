package labprograms;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LetterCombinations {

    static String[] phone = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    static void generate(String digits, int index, String current,
                         List<String> result) {

        if (index == digits.length()) {
            result.add(current);
            return;
        }

        int digit = digits.charAt(index) - '0';
        String letters = phone[digit];

        for (int i = 0; i < letters.length(); i++) {
            generate(digits, index + 1,
                     current + letters.charAt(i), result);
        }
    }

    public static List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();

        if (digits.length() == 0) {
            return result;
        }

        generate(digits, 0, "", result);

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter digits (2-9): ");
        String digits = sc.nextLine();

        List<String> result = letterCombinations(digits);

        System.out.println("Letter combinations: " + result);

        sc.close();
    }
}