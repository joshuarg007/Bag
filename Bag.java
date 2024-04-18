package Bag;  // Specifies the package name as 'Bag', useful for organization and avoiding naming conflicts.

import java.util.HashMap; // Imports the HashMap class from the java.util package for storing elements and their counts.
import java.util.Map;     // Imports the Map interface from the java.util package to be used for mapping items to their counts.

// A generic Bag class that supports operations to add, remove, and check elements, where T is a generic type parameter.
public class Bag<T> {
    private Map<T, Integer> map;  // Declares a private Map to store elements of type T and their occurrence counts.

    public Bag() {
        map = new HashMap<>();  // Constructs an empty HashMap when an instance of Bag is created.
    }

    // Adds an item of type T to the bag. If the item already exists, its count is increased.
    public void add(T item) {
        map.put(item, map.getOrDefault(item, 0) + 1);  // Puts the item into the map with an incremented count.
    }

    // Removes one occurrence of an item from the bag, if it exists.
    public void remove(T item) {
        if (map.containsKey(item)) {  // Checks if the item exists in the map.
            int count = map.get(item);  // Retrieves the current count of the item.
            if (count == 1) {
                map.remove(item);  // If the count is 1, remove the item completely from the map.
            } else {
                map.put(item, count - 1);  // If the count is more than 1, decrement the count by 1.
            }
        }
    }

    // Checks if the bag contains at least one occurrence of the specified item.
    public boolean contains(T item) {
        return map.containsKey(item);  // Returns true if the map contains the item, false otherwise.
    }

    // Returns the count of the specified item in the bag.
    public int count(T item) {
        return map.getOrDefault(item, 0);  // Returns the count of the item, or 0 if the item is not in the bag.
    }

    // Returns a string representation of the bag's contents.
    @Override
    public String toString() {
        return map.toString();  // Utilizes the HashMap's toString method to return a string representation of all items and their counts.
    }
}
