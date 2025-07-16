package package2;

import java.util.Scanner;

public class SwapppingOfTwoNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a = sc.nextInt();
		System.out.println("Enter the value of b");
		int b = sc.nextInt();
		System.out.println("Before swapping a = " +a);
		System.out.println("Before swapping b = " +b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping a = " + a);
		System.out.println("After swapping b = " + b);

		sc.close();
	}

}
