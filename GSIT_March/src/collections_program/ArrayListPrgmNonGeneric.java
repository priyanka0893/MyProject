package collections_program;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPrgmNonGeneric {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		@SuppressWarnings("rawtypes")
		List l1 = new ArrayList();

		// Adding element into generic array list
		l1.add(1);
		l1.add("priyanka");
		l1.add(100.78);
		l1.add(true);
		l1.add(null);
		l1.add("priyanka");

		// Printing array elements
		System.out.print(l1);

		System.out.println();
		// Accessing array elements through for loop
		for (int i = 0; i < l1.size(); i++) {
			System.out.print(l1.get(i) + " ");
		}
	}

}
