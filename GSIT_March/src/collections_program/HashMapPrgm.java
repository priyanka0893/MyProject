package collections_program;

import java.util.HashMap;
import java.util.Map;

public class HashMapPrgm {

	public static void main(String[] args) {
		Map<Integer, String> h1 = new HashMap<Integer, String>();

		h1.put(1, "Mango");
		h1.put(2, "Apple");
		h1.put(3, "Banana");
		h1.put(4, "Grapes");
		h1.put(5, "Orange");

		// Traversing using iterator
		for (Map.Entry<Integer, String> data : h1.entrySet()) {
			System.out.println("Key = " + data.getKey() + " Value = " + data.getValue());
		}

		// Printing Map elements
		System.out.println(h1);
		System.out.println();

		// Check if it contains key and value
		System.out.println("If the map contains the key passed " + h1.containsKey(5));
		System.out.println("If the map contains the value passed " + h1.containsValue("Apple"));

		System.out.println();

		// Remove an element
		System.out.println("Remove a element from map");
		h1.remove(2);
		System.out.println(h1);

		h1.put(2, "Apple");

		System.out.println();
		// Changing an element
		System.out.println("Changing an element in existing map");
		h1.put(4, "Kiwi");
		for (Map.Entry<Integer, String> data : h1.entrySet()) {
			System.out.println("Key = " + data.getKey() + " Value = " + data.getValue());
		}

		System.out.println();
		// Size of map
		System.out.println("Size = " + h1.size());

		System.out.println();
		// Fetch an element
		System.out.println("Fetch 4th element = " + h1.get(4));

	}

}
