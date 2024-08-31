package CoreJava;

import java.util.ArrayList;

public class ArrayListIncreaseSizeDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        
        // Increase size by adding more elements
        list.ensureCapacity(10);
        list.add("Cherry");
        list.add("Date");
        
        System.out.println("ArrayList after increasing size: " + list);
    }
}
