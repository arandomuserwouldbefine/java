package CoreJava;

import java.util.Scanner;

public class StringStartsWith {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the main string
        System.out.println("Enter the main string: ");
        String str1 = sc.nextLine();

        // Input the substring
        System.out.println("Enter the substring to check: ");
        String str2 = sc.nextLine();

        // Check if str1 starts with str2
        boolean startsWith = str1.startsWith(str2);

        // Display the result
        System.out.println("\"" + str1 + "\" starts with \"" + str2 + "\"? " + startsWith);

        sc.close();
    }
}
