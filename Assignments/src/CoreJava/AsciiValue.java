package CoreJava;

import java.util.Scanner;

public class AsciiValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a single character
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);

        // Display the ASCII value
        int ascii = (int) ch;
        System.out.println("The ASCII value of '" + ch + "' is: " + ascii);

        sc.close();
    }
}
