package collections_program;

import java.util.ArrayList;
import java.util.List;

public class MethodsOfArrayList {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		List<String> l2 = new ArrayList<String>();
		l1.add("PineApple" );
		l1.add("Apple");
		l1.add("Mango");
		l1.add("Grapes");
		l1.add("Banana");
		l1.add("Apple");
		
		l2.add("PineApple" );
		l2.add("Apple");
		l2.add("Mango");
		l2.add("Grapes");
		l2.add("Banana");
		l2.add("Apple");
		
		//Array List
		System.out.println("Array List is ");
		for(String data : l1) {
			System.out.print(data);
		}
		
		//To find if Array list is empty or not 
		System.out.println("Is array list empty : " +l1.isEmpty());
		
		//To find index of element
		System.out.println("Index of the element is : " +l1.indexOf("Mango"));
		
		//To find last index of Array List
		System.out.println("Last index of Array list is : " +l1.lastIndexOf("Apple"));
		
		//To get sub list from Array List
		System.out.println("Sub list of Array List is : " +l1.subList(2, 4));
		
		//Compare two array lists are equal or not
		System.out.println("Comparing two Array List : "+l1.equals(l2));
		
		//To set new element in Array List
		l1.set(2, "Butter Fruit");
		System.out.println(l1);
		
		//Remove an element from ArrayList
		System.out.println("Remove an element based on index");
		l1.remove(3);
		System.out.println(l1);
		
		//To check if element is present in Array List
		System.out.println("Check if Banana is present in List or not : " +l1.contains("Banana"));
	}

}
