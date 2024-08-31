package CoreJava;

import java.util.Scanner;

public class CountCharacters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a string
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        int letters = 0, spaces = 0, numbers = 0, others = 0;

        // Loop through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                letters++;
            } else if (Character.isDigit(ch)) {
                numbers++;
            } else if (Character.isSpaceChar(ch)) {
                spaces++;
            } else {
                others++;
            }
        }

        // Display the counts
        System.out.println("Letters: " + letters);
        System.out.println("Spaces: " + spaces);
        System.out.println("Numbers: " + numbers);
        System.out.println("Other characters: " + others);

        sc.close();
    }
}
