package CoreJava;

import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a positive integer
        System.out.println("Input an integer number less than ten billion: ");
        long number = sc.nextLong();

        // Check if the number is positive and less than ten billion
        if (number >= 0 && number < 10000000000L) {
            int digits = String.valueOf(number).length();
            System.out.println("Number of digits in the number: " + digits);
        } else {
            System.out.println("The number is not a positive integer less than ten billion.");
        }

        sc.close();
    }
}
