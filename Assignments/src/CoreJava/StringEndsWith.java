package CoreJava;

import java.util.Scanner;

public class StringEndsWith {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the main string
        System.out.println("Enter the main string: ");
        String str1 = sc.nextLine();

        // Input the substring
        System.out.println("Enter the substring to check: ");
        String str2 = sc.nextLine();

        // Check if str1 ends with str2
        boolean endsWith = str1.endsWith(str2);

        // Display the result
        System.out.println("\"" + str1 + "\" ends with \"" + str2 + "\"? " + endsWith);

        sc.close();
    }
}
