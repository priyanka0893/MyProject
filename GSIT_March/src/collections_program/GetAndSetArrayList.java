package collections_program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetAndSetArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> l1 = new ArrayList<Integer>();
		System.out.println("Enter size of array");
		int size = sc.nextInt();

		System.out.println("Enter the" + size + " elements of array");
		for (int i = 0; i < size; i++) {
			int val = sc.nextInt();
			l1.add(val);
		}

		System.out.println("Array elements");
		for (int i = 0; i < size; i++) {
			System.out.print(l1.get(i) + " ");
		}

		// Set Array elements
		l1.set(2, 34);
		l1.set(3, 45);

		System.out.println();
		// Array elements after setting value
		System.out.println("Array elements after setting value");
		for (int i = 0; i < size; i++) {
			System.out.print(l1.get(i) + " ");
		}

		// Getting particular element from Array list
		System.out.println();
		System.out.println("Getting array element at index 3 : " + l1.get(3));

		// Remove an element from array list
		System.out.println();
		l1.remove(2);

		// Array elements after removing value
		System.out.println("Array elements after removing value");
		for (int data : l1) {
			System.out.println(data);
		}

		sc.close();
	}

}
