package CoreJava;

class Triangle {
    int side1 = 3;
    int side2 = 4;
    int side3 = 5;

    public void printArea() {
        double s = (side1 + side2 + side3) / 2.0;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        System.out.println("Area of the triangle: " + area);
    }

    public void printPerimeter() {
        int perimeter = side1 + side2 + side3;
        System.out.println("Perimeter of the triangle: " + perimeter);
    }
}

public class TriangleDemo {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.printArea();
        triangle.printPerimeter();
    }
}
