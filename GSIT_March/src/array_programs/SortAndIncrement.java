package array_programs;

public class SortAndIncrement {

	public static void main(String[] args) {

		int arr[] = { 5, 8, 2, 3, 9 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int data : arr) {
			System.out.print((data + 1) + " ");
		}
	}

}
