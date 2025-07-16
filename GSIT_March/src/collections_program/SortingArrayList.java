package collections_program;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingArrayList {

	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(45 , 6 , 76, 12, 34, 4);
		System.out.println("Sorting of an array");
		
		Collections.sort(l1);
		
		System.out.println(l1);
		

	}

}
