package CoreJava;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class InterLeavingStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two strings
        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();

        Set<String> result = new HashSet<>();
        interleavings("", str1, str2, result);

        // Display all interleavings
        System.out.println("The interleaving strings are: " + result);

        sc.close();
    }

    private static void interleavings(String prefix, String str1, String str2, Set<String> result) {
        if (str1.isEmpty() && str2.isEmpty()) {
            result.add(prefix);
            return;
        }

        if (!str1.isEmpty()) {
            interleavings(prefix + str1.charAt(0), str1.substring(1), str2, result);
        }

        if (!str2.isEmpty()) {
            interleavings(prefix + str2.charAt(0), str1, str2.substring(1), result);
        }
    }
}
