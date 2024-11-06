/******************************************************************************

                            
                            HashMap<Integer, Integer> map = new HashMap<>();
                                    (key)    (value)     
                                    ////////////////////////////
Adding Key-Value Pairs: You can add items to the HashMap using the put method.

map.put(1, 100);
map.put(2, 200);
map.put(3, 300);

Retrieving Values by Key: Use the get method to retrieve a value associated with a specific key.
Integer value = map.get(1); // value will be 100


Removing Key-Value Pairs: To remove a specific key-value pair, you can use the remove method.
map.remove(1); // Removes the key 1 and its associated value

Getting the Size of the HashMap: You can determine how many key-value pairs are stored in the
HashMap using the size method.

int size = map.size(); // Returns the number of key-value pair
*******************************************************************************/
import java.util.HashMap;
public class HasingBasic
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		HashMap<Integer,Integer > map =new HashMap<>();
		int[] arr={1,2,200};
		map.put(1,arr[0]);
		map.put(2,300);
		map.put(3,800);
		 System.out.println("Value for key 2: " + map.get(1)); 
		 
		        // Checking for key/value
        System.out.println("Contains key 1: " + map.containsKey(1)); // true
        System.out.println("Contains value 300: " + map.containsValue(300)); // true
        
        
	}
}