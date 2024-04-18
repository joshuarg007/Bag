package Bag;  // Defines the package name as 'Bag'.

// Declares a public class named BagImplementation.
public class BagImplementation {  

    // Main method which serves as the entry point for any Java application.
    public static void main(String[] args) {  

        // Create a Bag instance for storing Strings.
        Bag<String> pcComponents = new Bag<>();

        // Add PC components to the bag, some of which are duplicates.
        pcComponents.add("Tower");  // Add "Tower" to the bag.
        pcComponents.add("Motherboard");  // Add "Motherboard" to the bag.
        pcComponents.add("NIC");  // Add "NIC" (Network Interface Card) to the bag.
        pcComponents.add("CPU");  // Add "CPU" (Central Processing Unit) to the bag.
        pcComponents.add("GPU");  // Add "GPU" (Graphics Processing Unit) to the bag.
        pcComponents.add("RAM");  // Add "RAM" (Random Access Memory) to the bag.
        pcComponents.add("RAM");  // Add another "RAM" to the bag, illustrating duplicate handling.
        pcComponents.add("SSD");  // Add "SSD" (Solid State Drive) to the bag.
        pcComponents.add("SSD");  // Add another "SSD" to the bag, illustrating duplicate handling.
        pcComponents.add("Fan");  // Add a "Fan" to the bag.
        pcComponents.add("Fan");  // Add another "Fan" to the bag.
        pcComponents.add("Fan");  // Add another "Fan" to the bag.
        pcComponents.add("Fan");  // Add another "Fan" to the bag.
        pcComponents.add("Fan");  // Add another "Fan" to the bag, illustrating handling of multiple duplicates.

        // Print the contents of the bag
        System.out.println("PC Components: " + pcComponents);

        // Check and print if specific components are present
        System.out.println("Contains 'GPU': " + pcComponents.contains("GPU"));  // Check presence of "GPU".
        System.out.println("Contains 'SSD': " + pcComponents.contains("SSD"));  // Check presence of "SSD".
        System.out.println("Contains 'NIC': " + pcComponents.contains("NIC"));  // Check presence of "NIC".

        // Check and print the number of components in the bag.
        System.out.println("Count of 'Solid State Drives': " + pcComponents.count("SSD"));  // Print count of "SSD".
        System.out.println("Count of 'Fans': " + pcComponents.count("Fan"));  // Print count of "Fan".

        // Remove one instance of "NIC" from the bag.
        pcComponents.remove("NIC");

        // Print the contents of the bag after removing one instance of "NIC".
        System.out.println("Bag contents after removing the NIC: " + pcComponents);

        // Check and print if "NIC" is still present in the bag after removal.
        System.out.println("Contains NIC after removal: " + pcComponents.contains("NIC"));  // Check presence of "NIC" after removal.

        // Check and print the count of "NIC" in the bag after its removal.
        System.out.println("Count of NICs after removal: " + pcComponents.count("NIC"));  // Print count of "NIC" after removal.
    }
}
