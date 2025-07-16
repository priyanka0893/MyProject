package package2;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count");
		int count = sc.nextInt();
		int n1 = 1;
		int n2 = 1;
		System.out.println("Fibonacci Series is : " + n1 + " , " + n2 + " , ");
		int i = 1;
		while (i <= count) {
			int sum = n1 + n2;
			n1 = n2;
			n2 = sum;

			System.out.println(sum + " ");
			i++;
		}
		sc.close();
	}

}
