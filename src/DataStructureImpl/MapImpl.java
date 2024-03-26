package DataStructureImpl;

import java.util.HashMap;
import java.util.Map;

public class MapImpl {
    public static void main(String[] args) {
        
        Map<String, Integer> myMap = new HashMap<>();

        
        myMap.put("Alice", 25);
        myMap.put("Bob", 30);
        myMap.put("Charlie", 35);
        
        System.out.println(myMap);

        // Accessing values using keys
        System.out.println();
        System.out.println("Age of Alice: " + myMap.get("Alice"));
        System.out.println("Age of Bob: " + myMap.get("Bob"));
   

        // Iterating over the map
        System.out.println();
        System.out.println("Iterating over the map:");
        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println();
        System.out.println("Does key 'Bob' exist? " + myMap.containsKey("Bob"));

        // Removing a key-value pair
        System.out.println();
        myMap.remove("Charlie");
        System.out.println("Map after removing Charlie: " + myMap);
    }
}
