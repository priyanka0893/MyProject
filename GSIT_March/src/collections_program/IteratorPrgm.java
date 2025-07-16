package collections_program;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class IteratorPrgm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<String> s1 = new HashSet<String>();

		System.out.println("Enter the size elements");
		int size = sc.nextInt();

		System.out.println();
		System.out.println("Enter the elements");
		for (int i = 0; i < size; i++) {
			String data = sc.next();
			s1.add(data);
		}

		System.out.println();
		System.out.println("Hashset elements");
		Iterator<String> i = s1.iterator();
		while (i.hasNext()) {
			System.out.print(i.next() + " ");
		}
		sc.close();
	}

}
