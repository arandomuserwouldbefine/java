package CoreJava;

import java.util.ArrayList;

public class ArrayListSwapDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        
        System.out.println("Original ArrayList: " + list);
        
        // Swap elements at index 0 and 2
        String temp = list.get(0);
        list.set(0, list.get(2));
        list.set(2, temp);
        
        System.out.println("ArrayList after swapping: " + list);
    }
}
