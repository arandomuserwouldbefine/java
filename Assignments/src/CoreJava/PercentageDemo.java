package CoreJava;
import java.util.Scanner;

// Abstract class Marks
abstract class Marks {
    public abstract double getPercentage();
}

// Class A to calculate percentage for 3 subjects
class A extends Marks {
    private int subject1, subject2, subject3;

    // Constructor
    public A(int subject1, int subject2, int subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    // Override getPercentage method
    @Override
    public double getPercentage() {
        int total = subject1 + subject2 + subject3;
        return (total / 3.0);
    }
}

// Class B to calculate percentage for 4 subjects
class B extends Marks {
    private int subject1, subject2, subject3, subject4;

    // Constructor
    public B(int subject1, int subject2, int subject3, int subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    // Override getPercentage method
    @Override
    public double getPercentage() {
        int total = subject1 + subject2 + subject3 + subject4;
        return (total / 4.0);
    }
}

public class PercentageDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks for Student A
        System.out.println("Enter marks for Student A in three subjects:");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        A studentA = new A(m1, m2, m3);

        // Input marks for Student B
        System.out.println("Enter marks for Student B in four subjects:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        B studentB = new B(n1, n2, n3, n4);

        // Display percentages
        System.out.println("Percentage of Student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage of Student B: " + studentB.getPercentage() + "%");

        sc.close();
    }
}
