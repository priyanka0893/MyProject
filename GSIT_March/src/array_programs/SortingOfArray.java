package array_programs;

import java.util.Arrays;
import java.util.Scanner;

public class SortingOfArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of an array");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter the " + size + " elements");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println();
		System.out.println("Sorted Array");

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < size; i++) {
			System.out.print(" " + arr[i]);
		}
		
		Arrays.sort(arr);
		System.out.println();
		System.out.println("Sorter array using Arrays class");
		for (int i = 0; i < size; i++) {
			System.out.print(" " + arr[i]);
		}
		sc.close();
	}

}
