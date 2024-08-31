package CoreJava;

import java.util.HashSet;

public class SetCompareDemo {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Cherry");
        
        HashSet<String> set2 = new HashSet<>();
        set2.add("Banana");
        set2.add("Cherry");
        set2.add("Date");
        
        set1.retainAll(set2);
        System.out.println("Common elements in both sets: " + set1);
    }
}
