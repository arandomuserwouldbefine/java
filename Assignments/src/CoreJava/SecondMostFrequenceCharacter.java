package CoreJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SecondMostFrequenceCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        // Frequency map
        Map<Character, Integer> freqMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        char maxChar = 0, secondMaxChar = 0;
        int maxCount = 0, secondMaxCount = 0;

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                secondMaxCount = maxCount;
                secondMaxChar = maxChar;
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            } else if (entry.getValue() > secondMaxCount && entry.getKey() != maxChar) {
                secondMaxCount = entry.getValue();
                secondMaxChar = entry.getKey();
            }
        }

        // Display the result
        System.out.println("The second most frequent character in the string is: " + secondMaxChar);

        sc.close();
    }
}
