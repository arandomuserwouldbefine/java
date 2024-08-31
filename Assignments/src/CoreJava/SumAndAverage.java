package CoreJava;

import java.util.Scanner;

public class SumAndAverage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        // Ask user to input 5 numbers
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            sum += num;
        }

        // Calculate the average
        double average = sum / 5.0;

        // Display the sum and average
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        // Close the scanner
        sc.close();
    }
}
