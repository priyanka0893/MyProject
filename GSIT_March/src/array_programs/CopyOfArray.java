package array_programs;

import java.util.Scanner;

public class CopyOfArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int copyarr[] = new int[size];
		int copyarr1[];
		
		System.out.println("Enter " + size + " elements");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Copy of an array");
		copyarr = arr;
		System.out.println("Contents of arr[] ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

		System.out.println("\n\nContents of copyarr[] ");
		for (int i = 0; i < copyarr.length; i++)
			System.out.print(copyarr[i] + " ");
		
		copyarr1 = arr.clone();
		System.out.println();
		System.out.println("\n\nContents of copyarr1[] using clone method ");
		for (int i = 0; i < copyarr1.length; i++)
			System.out.print(copyarr1[i] + " ");

		
		
		
		sc.close();
	}

}
