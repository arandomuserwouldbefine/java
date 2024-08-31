package CoreJava;

import java.util.Scanner;

public class VotingEligibility {
    public static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not valid for voting");
        } else {
            System.out.println("Welcome to vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        try {
            validate(age);
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
