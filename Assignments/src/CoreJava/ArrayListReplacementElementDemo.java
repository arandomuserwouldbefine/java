package CoreJava;

import java.util.ArrayList;

public class ArrayListReplacementElementDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        
        list.set(1, "Blueberry");
        System.out.println("ArrayList after replacing second element: " + list);
    }
}
