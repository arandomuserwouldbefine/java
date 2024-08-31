package CoreJava;

import java.util.HashSet;

public class HashSetToArrayDemo {
    public static void main(String[] args) {
        HashSet<String> colorsSet = new HashSet<>();
        colorsSet.add("Red");
        colorsSet.add("Green");
        colorsSet.add("Blue");
        
        String[] colorsArray = colorsSet.toArray(new String[0]);
        System.out.println("HashSet converted to Array:");
        for (String color : colorsArray) {
            System.out.println(color);
        }
    }
}
