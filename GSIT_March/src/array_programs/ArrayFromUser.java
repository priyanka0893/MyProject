package array_programs;

import java.util.Scanner;

public class ArrayFromUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of an array");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter the " + size + " elements");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Array element are = ");
		for (int ref : arr) {
			System.out.print(" " + ref);
		}

		System.out.println();
		System.out.println("Reverse of an Array = ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}

}
