package CoreJava;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetToArrayListDemo {
    public static void main(String[] args) {
        HashSet<String> colorsSet = new HashSet<>();
        colorsSet.add("Red");
        colorsSet.add("Green");
        colorsSet.add("Blue");
        
        ArrayList<String> colorsList = new ArrayList<>(colorsSet);
        System.out.println("HashSet converted to ArrayList: " + colorsList);
    }
}
