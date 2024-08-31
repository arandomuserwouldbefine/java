package CoreJava;

import java.util.Scanner;

public class CompareStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the first string
        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();

        // Input the second string
        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();

        // Compare strings
        boolean areEqual = str1.equals(str2);

        // Display the result
        System.out.println("Comparing " + str1 + " and " + str2 + ": " + areEqual);

        sc.close();
    }
}
