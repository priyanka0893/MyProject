package array_programs;

import java.util.Scanner;

public class NumPresentInArray {

	public static void main(String[] args) {

		int[] arr = { 34, 56, 36, 12, 77, 87, 92, 44, 31 };
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the element to be searched");
		int num = sc.nextInt();
		boolean res = false;
		for (int data : arr) {
			if (num == data) {
				res = true;
			}
		}
		if (res == true) {
			System.out.println("Number is present in Array");
		} else {
			System.out.println("Number is not present");
		}

		sc.close();
	}

}
