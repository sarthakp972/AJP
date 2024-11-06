
/*A HashSet is a part of the Java Collections Framework and is an implementation of the Set interface. 
It is used to store a collection of unique elements, meaning it does not allow duplicate values.
HashSet is backed by a hash table, which means it offers efficient performance for basic operations like add, remove, and contains.

A HashSet does not allow duplicate elements. If you attempt to add an element that is already present in the set,
the add() method will simply return false without throwing an error.

*/
   import java.util.HashSet;
   
public class HashSet1
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	  // Create a HashSet
        HashSet<String> set = new HashSet<>();
        
        // Add elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // Duplicate entry, will not be added

        // Display elements
        System.out.println("HashSet: " + set); // Output: HashSet: [Banana, Apple, Cherry]

        // Remove an element
        set.remove("Banana");
        System.out.println("After removing 'Banana': " + set); // Output: [Apple, Cherry]

        // Check if an element exists
        System.out.println("Contains 'Apple': " + set.contains("Apple")); // true
        System.out.println("Contains 'Banana': " + set.contains("Banana")); // false

        // Iterate over elements
        System.out.println("Iterating over HashSet:");
        
        for (String fruit1 : set) {
            System.out.println(fruit1); // Print each element
        }

        // Size of the HashSet
        System.out.println("Size of HashSet: " + set.size()); // Output: 2
   
        
        //union of two array
        
        
        
	}
}