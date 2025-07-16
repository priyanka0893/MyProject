package collections_program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListGenericPrgm {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<String> l1 = new ArrayList<String>();
		System.out.println("Enter the size of array");
		int size = sc.nextInt();

		System.out.println("Enter the " + size + " elements");
		for (int i = 0; i < size; i++) {
			String val = sc.next();
			l1.add(val);
		}

		System.out.println("Print array elements");
		for (String data : l1) {
			System.out.println(data + " ");
		}
		
		sc.close();
	}

}
