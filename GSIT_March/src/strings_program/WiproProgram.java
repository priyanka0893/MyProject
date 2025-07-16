package strings_program;

import java.util.ArrayList;
import java.util.List;

public class WiproProgram {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 0, 0, 0, 0 };
		int b[] = { 5, 6, 7 };

		List<Integer> l1 = new ArrayList<Integer>();

		for (int num : a) {
			if (num != 0) {
				l1.add(num);
			}
		}
		for (int i = 0; i < b.length && i < a.length; i++) {
			l1.set(i, b[i]);
		}

		System.out.print("Values : ");
		for (int num : l1) {
			System.out.print(num +" , ");
		}
	}

}
