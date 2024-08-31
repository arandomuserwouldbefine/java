package CoreJava;

import java.util.ArrayList;

public class ArrayListSublistDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        
        System.out.println("Original ArrayList: " + list);
        
        ArrayList<String> subList = new ArrayList<>(list.subList(1, 4));
        System.out.println("Extracted portion: " + subList);
    }
}
