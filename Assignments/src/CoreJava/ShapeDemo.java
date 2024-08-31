package CoreJava;

import java.util.Scanner;

class Rectangle {
    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void printArea() {
        int area = length * breadth;
        System.out.println("Area of the rectangle: " + area);
    }

    public void printPerimeter() {
        int perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}

class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }
}

public class ShapeDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input for rectangle
        System.out.println("Enter length of the rectangle: ");
        int length = sc.nextInt();
        System.out.println("Enter breadth of the rectangle: ");
        int breadth = sc.nextInt();

        // Create Rectangle object
        Rectangle rectangle = new Rectangle(length, breadth);
        rectangle.printArea();
        rectangle.printPerimeter();

        // Get user input for square
        System.out.println("Enter side of the square: ");
        int side = sc.nextInt();

        // Create Square object
        Square square = new Square(side);
        square.printArea();
        square.printPerimeter();

        sc.close();
    }
}
