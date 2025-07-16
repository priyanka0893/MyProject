package array_programs;

public class ArrayEqual {

	public static void main(String[] args) {
		int[] arr = { 34, 56, 36, 12, 77 , 12};
		int[] arr1 = { 34, 56, 36, 12, 77 , 12 };
		boolean res = true;
		if (arr.length == arr1.length) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != arr1[i]) {
					res = false;
					break;
				}
			}
		} else {
			res = false;
		}
		if (res == true) {
			System.out.println("Array are same");
		} else {
			System.out.println("Array are different");
		}
	}

}
