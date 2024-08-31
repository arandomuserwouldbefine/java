package CoreJava;

import java.util.Scanner;

public class CharacterAtIndex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        // Input the index
        System.out.println("Enter the index: ");
        int index = sc.nextInt();

        // Check if the index is within bounds
        if (index >= 0 && index < str.length()) {
            char ch = str.charAt(index);
            System.out.println("The character at position " + index + " is " + ch);
        } else {
            System.out.println("Index out of bounds.");
        }

        sc.close();
    }
}
