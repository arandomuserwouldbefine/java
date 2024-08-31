package CoreJava;

import java.util.Scanner;

public class StringConcatenation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the first string
        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();

        // Input the second string
        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();

        // Concatenate strings
        String result = str1 + str2;

        // Display the result
        System.out.println("The concatenated string is: " + result);

        sc.close();
    }
}
