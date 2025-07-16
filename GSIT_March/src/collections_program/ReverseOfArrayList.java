package collections_program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseOfArrayList {

	public static void main(String[] args) {

		List<String> l1 = new ArrayList<String>();
		l1.add(0, "Pannu");
		l1.add(1, "Priyanka");
		l1.add(2, "Piku");
		l1.add(3, "Pattu");
		l1.add(4, "Play");

		// Array list elements
		System.out.println("List of array elements");
		for (String data : l1) {
			System.out.print(data +" ");
		}
		
		System.out.println();
		Collections.reverse(l1);
		System.out.println();
		
		// Array list elements after reverse
		System.out.println("List of array elements after reverse");
		for (String data : l1) {
			System.out.print(data+" ");
		}
		
		System.out.println();
		Collections.sort(l1);
		System.out.println();
		
		// Array list elements after sorting
		System.out.println("List of array elements after sorting");
		for (String data : l1) {
			System.out.print(data+" ");
		}
		
	}

}
