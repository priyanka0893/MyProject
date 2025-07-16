package package2;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {

		int a;
		int fact = 1;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number ");
		a = sc.nextInt();

		for (int i = 1; i <= a; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + a + " = " + fact);
		sc.close();
	}

}
