package CoreJava;

import java.util.HashMap;
import java.util.Collection;

public class HashMapValuesDemo {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "One");
        map.put("2", "Two");
        map.put("3", "Three");
        
        Collection<String> values = map.values();
        System.out.println("Collection view of values in the map: " + values);
    }
}
