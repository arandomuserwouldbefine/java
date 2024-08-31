package CoreJava;

import java.util.Scanner;

public class ComputeNNN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input an integer
        System.out.println("Input number: ");
        int n = sc.nextInt();

        // Compute n + nn + nnn
        int nn = Integer.parseInt(n + "" + n);
        int nnn = Integer.parseInt(n + "" + n + "" + n);
        int result = n + nn + nnn;

        // Display the result
        System.out.println(n + " + " + nn + " + " + nnn + " = " + result);

        sc.close();
    }
}
