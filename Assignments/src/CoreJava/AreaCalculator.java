package CoreJava;

import java.util.Scanner;

public class AreaCalculator {

    // Method to calculate the area of a square
    public void printArea(int side) {
        int area = side * side;
        System.out.println("Area of the square: " + area);
    }

    // Method to calculate the area of a rectangle
    public void printArea(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area of the rectangle: " + area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaCalculator calculator = new AreaCalculator();

        // Get user input for square
        System.out.println("Enter the side of the square: ");
        int side = sc.nextInt();
        calculator.printArea(side);

        // Get user input for rectangle
        System.out.println("Enter the length of the rectangle: ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle: ");
        int breadth = sc.nextInt();
        calculator.printArea(length, breadth);

        sc.close();
    }
}
