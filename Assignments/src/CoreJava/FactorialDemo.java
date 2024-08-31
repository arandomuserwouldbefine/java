package CoreJava;
import java.util.Scanner;

public class FactorialDemo {

    public static int Factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to calculate its factorial:");
        int num = sc.nextInt();

        System.out.println("Factorial of " + num + " is: " + Factorial(num));

        sc.close();
    }
}
