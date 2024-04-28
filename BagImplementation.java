package Bag;  // Defines the package name as 'Bag'.

// Declares a public class named BagImplementation.
public class BagImplementation {

    // Main method which serves as the entry point for any Java application.
    public static void main(String[] args) {

        // Create two instances of the Bag class.
        Bag<String> bag1 = new Bag<>();  // First bag instance.
        Bag<String> bag2 = new Bag<>();  // Second bag instance.

        // Add elements to each bag, including duplicates.
        bag1.add("CPU");
        bag1.add("RAM");
        bag1.add("RAM");
        bag1.add("GPU");

        bag2.add("GPU");
        bag2.add("GPU");
        bag2.add("HDD");
        bag2.add("SSD");
        bag2.add("SSD");

        // Print the size of each bag using the size method.
        System.out.println("Size of bag1: " + bag1.size());
        System.out.println("Size of bag2: " + bag2.size());

        // Merge the two bags together using the merge method.
        bag1.merge(bag2);

        // Print the merged bag contents.
        System.out.println("Merged bag contents: " + bag1);

        // Create a new bag containing only the distinct elements using the distinct method.
        Bag<String> distinctBag = bag1.distinct();

        // Print the distinct bag contents.
        System.out.println("Distinct bag contents: " + distinctBag);
    }
}
