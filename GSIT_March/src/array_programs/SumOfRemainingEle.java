package array_programs;

public class SumOfRemainingEle {

	public static void main(String[] args) {
		int[] arr = { 3, 5, 1, 9 };
		int sum = 0;
		
		//Calculate sum of array elements
		for (int data : arr) {
			sum = sum + data;
		}
		
		//Sum of remaining elements
		//arr[1] = 5 + 1 + 9 = 15
		//arr[2] = 3 + 1 + 9 = 13
		// arr[3] = 3 + 5 + 9 = 17
		for (int i = 0; i < arr.length; i++) {
			System.out.print(sum - arr[i] + " ");
		}
	}

}
