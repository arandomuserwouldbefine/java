package CoreJava;

import java.util.ArrayList;

public class ArrayListCompareDemo {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Apple");
        list2.add("Banana");
        
        System.out.println("Are the two ArrayLists equal? " + list1.equals(list2));
    }
}
