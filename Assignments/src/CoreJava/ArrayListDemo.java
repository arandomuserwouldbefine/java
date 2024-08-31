package CoreJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Create an ArrayList and add colors
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");
        
        // Print the ArrayList
        System.out.println("Colors: " + colors);
        
        // Iterate through all elements
        System.out.println("Iterating through ArrayList:");
        for (String color : colors) {
            System.out.println(color);
        }
        
        // Insert an element at the first position
        colors.add(0, "Orange");
        System.out.println("After inserting at first position: " + colors);
        
        // Retrieve an element at a specified index
        System.out.println("Element at index 2: " + colors.get(2));
        
        // Update specific element
        colors.set(2, "Cyan");
        System.out.println("After updating index 2: " + colors);
        
        // Remove the third element
        colors.remove(2);
        System.out.println("After removing the third element: " + colors);
        
        // Search for an element
        System.out.println("Searching for 'Green': " + colors.contains("Green"));
        
        // Sort the ArrayList
        Collections.sort(colors);
        System.out.println("Sorted ArrayList: " + colors);
        
        // Copy ArrayList into another
        ArrayList<String> colorsCopy = new ArrayList<>(colors);
        System.out.println("Copied ArrayList: " + colorsCopy);
        
        // Shuffle elements in the ArrayList
        Collections.shuffle(colors);
        System.out.println("Shuffled ArrayList: " + colors);
    }
}
