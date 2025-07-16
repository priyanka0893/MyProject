package array_programs;

public class LargestNumInArray {

	public static void main(String[] args) {
		int[] arr = { 34, 56, 36, 12, 77, 87, 3, 44, 31 };
		int largest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		System.out.println("Largest = " + largest);
	}
}
