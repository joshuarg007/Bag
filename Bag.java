package Bag;

import java.util.HashMap;
import java.util.Map;

public class Bag<T> {
    private Map<T, Integer> map;  // Declare a private Map to store elements of type T and their occurrence counts.

    public Bag() {
        map = new HashMap<>();  // Construct an empty HashMap when an instance of Bag is created.
    }

    // Adds an item of type T to the bag. If the item already exists, its count is increased.
    public void add(T item) {
        map.put(item, map.getOrDefault(item, 0) + 1);  // Put the item into the map with an incremented count.
    }

    // Removes one occurrence of an item from the bag, if it exists.
    public void remove(T item) {
        if (map.containsKey(item)) {  // Check if the item exists in the map.
            int count = map.get(item);  // Retrieve the current count of the item.
            if (count == 1) {
                map.remove(item);  // If the count is 1, remove the item completely from the map.
            } else {
                map.put(item, count - 1);  // If the count is more than 1, decrement the count by 1.
            }
        }
    }

    // Checks if the bag contains at least one occurrence of the specified item.
    public boolean contains(T item) {
        return map.containsKey(item);  // Return true if the map contains the item, false otherwise.
    }

    // Returns the count of the specified item in the bag.
    public int count(T item) {
        return map.getOrDefault(item, 0);  // Return the count of the item, or 0 if the item is not in the bag.
    }

    // Returns the total number of elements in the bag, including duplicates.
    public int size() {
        int total = 0;
        for (int count : map.values()) {  // Iterate over the counts of all elements in the map.
            total += count;  // Add each count to the total.
        }
        return total;  // Return the total number of elements.
    }

    // Merges the elements of another bag into the current bag.
    public void merge(Bag<T> otherBag) {
        for (T item : otherBag.map.keySet()) {  // Iterate over all items in the other bag.
            int count = otherBag.count(item);  // Get the count of each item in the other bag.
            map.put(item, map.getOrDefault(item, 0) + count);  // Merge the item and its count into the current bag.
        }
    }

    // Returns a new bag that contains only the distinct elements from the current bag.
    public Bag<T> distinct() {
        Bag<T> distinctBag = new Bag<>();  // Create a new bag to store distinct elements.
        for (T item : map.keySet()) {  // Iterate over all items in the current bag.
            distinctBag.add(item);  // Add each item to the distinct bag.
        }
        return distinctBag;  // Return the distinct bag.
    }

    @Override
    public String toString() {
        return map.toString();  // Utilize the HashMap's toString method to return a string representation of all items and their counts.
    }
}
