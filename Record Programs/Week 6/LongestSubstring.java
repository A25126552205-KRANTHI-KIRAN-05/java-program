package labprograms;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class LongestSubstring {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        Set<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;
        int start = 0;

        for (int right = 0; right < str.length(); right++) {

            while (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }

            set.add(str.charAt(right));

            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                start = left;
            }
        }

        String longest = str.substring(start, start + maxLength);

        System.out.println("Longest substring: " + longest);
        System.out.println("Length: " + maxLength);

        sc.close();
    }
}