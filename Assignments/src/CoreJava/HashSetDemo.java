package CoreJava;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetDemo {
    public static void main(String[] args) {
        // Create a HashSet and add some colors
        HashSet<String> colorsSet = new HashSet<>();
        colorsSet.add("Red");
        colorsSet.add("Green");
        colorsSet.add("Blue");
        
        // Append specified element to the HashSet
        colorsSet.add("Yellow");
        System.out.println("HashSet: " + colorsSet);
    }
}
