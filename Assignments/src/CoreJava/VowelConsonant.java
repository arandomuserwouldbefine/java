package CoreJava;

import java.util.Scanner;

public class VowelConsonant {

    public static void main(String[] args) {
        // Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask for user input
        System.out.println("Enter a single character: ");
        String input = sc.next();

        // Check if the input length is exactly 1
        if (input.length() != 1) {
            System.out.println("Error: Please enter exactly one character.");
        } else {
            char a = input.charAt(0);

            // Check if the input is a letter
            if (Character.isLetter(a)) {
                // Convert to lowercase to handle both cases
                a = Character.toLowerCase(a);

                // Check if the character is a vowel
                if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
                    System.out.println(a + " is a vowel.");
                } else {
                    System.out.println(a + " is a consonant.");
                }
            } else {
                System.out.println("Error: The input is not a valid letter.");
            }
        }
        
        // Close the scanner
        sc.close();
    }
}
