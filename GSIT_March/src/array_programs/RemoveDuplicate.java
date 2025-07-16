package array_programs;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public void removeduplicate(int arr[]) {
		int n = arr.length;
		Set<Integer> hash_Set = new HashSet<Integer>();
		for (int i = 0; i < n; i++)
			hash_Set.add(arr[i]);
		System.out.print(hash_Set);

	}

	public static void main(String[] args) {
		int[] arr = { 34, 56, 34, 12, 77, 87, 34, 44, 56 };
		RemoveDuplicate r1 = new RemoveDuplicate();
		r1.removeduplicate(arr);
	}

}
