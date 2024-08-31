package CoreJava;

import java.util.HashSet;

public class HashSetIterationDemo {
    public static void main(String[] args) {
        HashSet<String> colorsSet = new HashSet<>();
        colorsSet.add("Red");
        colorsSet.add("Green");
        colorsSet.add("Blue");
        
        System.out.println("Iterating through HashSet:");
        for (String color : colorsSet) {
            System.out.println(color);
        }
    }
}
