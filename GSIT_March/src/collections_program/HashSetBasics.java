package collections_program;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetBasics {

	public static void main(String[] args) {
		Set<String> s1 = new HashSet<String>();
		
		//Adding elements into Hashset
		s1.add("Apple");
		s1.add("Mango");
		s1.add("Banana");
		s1.add("Orange");
		s1.add("Grapes");
		
		System.out.println("Set elements are : " +s1);
		
		//Check if element is present or not
		System.out.println("Set contains Element Banana :" +s1.contains("Banana"));
		
		//Remove an element
		System.out.println("Remove an element from set");
		s1.remove("Orange");
		System.out.println("Set elements are : " +s1);
		
		
		//Traverse using Iterator Class
		System.out.println("Traverse using Iterator Class");
		s1.add("Kiwi");
		Iterator<String> i = s1.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}

	}

}
