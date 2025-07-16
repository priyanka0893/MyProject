package array_programs;

public class ArrayPrgm {

	public static void main(String args[]) {
		String[] arr = { "Priya", "Panvith", "Piku", "Pattu", "Moni" };

		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i].contains("M")) {
				System.out.print(arr[i] + " ");
				System.out.println();
			}
			System.out.print(arr[i] + " ");
		}
	}
}
