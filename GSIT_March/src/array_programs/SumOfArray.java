package array_programs;

import java.util.Scanner;

public class SumOfArray {
	
	public int sum(int[] arr) {
		int sum = 0;
		for(int i = 0; i< arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of an array");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter the " + size + " elements");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		SumOfArray s1 = new SumOfArray();
		System.out.println("Sum of array " +s1.sum(arr));
		sc.close();
	}

}
