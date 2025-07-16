package array_programs;

public class DuplicateOfArray {

	public static void main(String[] args) {
		int[] arr = { 34, 56, 36, 12, 77, 87, 3, 44, 31, 34 };
		boolean res = false;
		for (int i = 0; i <= arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					res = true;
				}
			}
		}
		if (res == true) {
			System.out.println("Duplicate Number is present in Array");
		} else {
			System.out.println("Duplicate Number is not present in Array");
		}

	}

}
