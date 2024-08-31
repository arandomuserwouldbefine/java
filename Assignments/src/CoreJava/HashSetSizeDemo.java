package CoreJava;

import java.util.HashSet;

public class HashSetSizeDemo {
    public static void main(String[] args) {
        HashSet<String> colorsSet = new HashSet<>();
        colorsSet.add("Red");
        colorsSet.add("Green");
        colorsSet.add("Blue");
        
        System.out.println("Number of elements in HashSet: " + colorsSet.size());
    }
}
