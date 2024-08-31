package CoreJava;

// Base class Shape
class Shape {
    public void printShape() {
        System.out.println("This is shape");
    }
}

// Rectangle class inheriting Shape
class Rectangle extends Shape {
    public void printRectangle() {
        System.out.println("This is rectangular shape");
    }
}

// Circle class inheriting Shape
class Circle extends Shape {
    public void printCircle() {
        System.out.println("This is circular shape");
    }
}

// Square class inheriting Rectangle
class Square extends Rectangle {
    public void printSquare() {
        System.out.println("Square is a rectangle");
    }
}

public class ShapeDemo1 {
    public static void main(String[] args) {
        Square square = new Square();
        square.printShape();     // Calls method from Shape class
        square.printRectangle(); // Calls method from Rectangle class
    }
}
