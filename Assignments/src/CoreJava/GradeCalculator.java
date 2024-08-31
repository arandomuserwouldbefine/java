package CoreJava;

import java.util.Scanner;

public class GradeCalculator {

    public static void displayGrade(int marks) {
        if (marks >= 91 && marks <= 100) {
            System.out.println("Grade: A");
        } else if (marks >= 81 && marks <= 90) {
            System.out.println("Grade: B");
        } else if (marks >= 71 && marks <= 80) {
            System.out.println("Grade: C");
        } else if (marks >= 61 && marks <= 70) {
            System.out.println("Grade: D");
        } else if (marks >= 41 && marks <= 60) {
            System.out.println("Grade: DD");
        } else {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks (out of 100):");
        int marks = sc.nextInt();

        displayGrade(marks);

        sc.close();
    }
}
