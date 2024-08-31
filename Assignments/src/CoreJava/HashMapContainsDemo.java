package CoreJava;

import java.util.HashMap;

public class HashMapContainsDemo {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "One");
        
        boolean isEmpty = map.isEmpty();
        System.out.println("Does the map contain key-value mappings? " + !isEmpty);
    }
}
