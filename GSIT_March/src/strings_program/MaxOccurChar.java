package strings_program;

public class MaxOccurChar {
	public static void main(String args[]) {

		String s = "Java programming";
		String[] arr = s.split("");

		int maxCount = 0;
		int count = 1;

		for (int i = 0; i < arr.length; i++) {
			count = 1;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i].equals(arr[j])) {
					count++;
				}
			}
			if (count > maxCount) {
				maxCount = count;
			}
		}

		System.out.print("Character with the higest Occurance is: " + maxCount + " ");

		for (int i = 0; i < arr.length; i++) {
			count = 1;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i].equals(arr[j])) {
					count++;
				}
			}

			if (count == maxCount) {
				System.out.print(arr[i]);
			}
		}
	}
}
