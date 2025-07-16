package array_programs;

public class DivisibleByNum {

	public static void main(String[] args) {

		int[] arr = { 34, 56, 36, 12, 77, 87, 92, 44, 31 };
		for (int data : arr) {
			if (data % 11 == 0) {
				continue;
			} else {
				System.out.println(" Number = " + data);
			}
		}

	}

}
