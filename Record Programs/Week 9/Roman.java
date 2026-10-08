package labprograms;

import java.util.Scanner;

public class Roman {

    public int romanToInteger(String s) {

        int total = 0;

        for (int i = 0; i < s.length(); i++) {

            int current = value(s.charAt(i));

            if (i + 1 < s.length() &&
                current < value(s.charAt(i + 1))) {

                total -= current;
            } else {
                total += current;
            }
        }

        return total;
    }

    private int value(char ch) {

        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roman numeral: ");
        String roman = sc.nextLine().toUpperCase();

        Roman obj = new Roman();

        int result = obj.romanToInteger(roman);

        System.out.println("Integer value: " + result);

        sc.close();
    }
}