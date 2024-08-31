package CoreJava;

import java.util.Scanner;

// Abstract class Shape
abstract class Shape {
    public abstract double RectangleArea(double length, double breadth);
    public abstract double SquareArea(double side);
    public abstract double CircleArea(double radius);
}

// Class Area implementing Shape
class Area extends Shape {

    @Override
    public double RectangleArea(double length, double breadth) {
        return length * breadth;
    }

    @Override
    public double SquareArea(double side) {
        return side * side;
    }

    @Override
    public double CircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}

public class AreaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area area = new Area();

        // Input for Rectangle
        System.out.println("Enter the length and breadth of the rectangle:");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        System.out.println("Area of Rectangle: " + area.RectangleArea(length, breadth));

        // Input for Square
        System.out.println("Enter the side of the square:");
        double side = sc.nextDouble();
        System.out.println("Area of Square: " + area.SquareArea(side));

        // Input for Circle
        System.out.println("Enter the radius of the circle:");
        double radius = sc.nextDouble();
        System.out.println("Area of Circle: " + area.CircleArea(radius));

        sc.close();
    }
}
