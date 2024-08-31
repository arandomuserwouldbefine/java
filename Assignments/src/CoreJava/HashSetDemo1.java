package CoreJava;

import java.util.HashMap;

public class HashMapDemoOne {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "One");
        map.put("2", "Two");
        map.put("3", "Three");
        
        System.out.println("HashMap: " + map);
    }
}
