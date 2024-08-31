package CoreJava;

import java.util.Scanner;

class Complex {
    int real;
    int imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }

    public Complex multiply(Complex other) {
        int realPart = this.real * other.real - this.imaginary * other.imaginary;
        int imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(realPart, imaginaryPart);
    }

    public void print() {
        System.out.println(this.real + " + " + this.imaginary + "i");
    }
}

public class ComplexDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input for first complex number
        System.out.println("Enter real and imaginary part of first complex number: ");
        int real1 = sc.nextInt();
        int imaginary1 = sc.nextInt();
        Complex c1 = new Complex(real1, imaginary1);

        // Get user input for second complex number
        System.out.println("Enter real and imaginary part of second complex number: ");
        int real2 = sc.nextInt();
        int imaginary2 = sc.nextInt();
        Complex c2 = new Complex(real2, imaginary2);

        // Perform operations
        Complex sum = c1.add(c2);
        Complex difference = c1.subtract(c2);
        Complex product = c1.multiply(c2);

        // Print results
        System.out.print("Sum: ");
        sum.print();
        System.out.print("Difference: ");
        difference.print();
        System.out.print("Product: ");
        product.print();

        sc.close();
    }
}
