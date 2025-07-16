package package2;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num;
		int revNum = 0;
		int rem;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		num = sc.nextInt();
		int temp = num;
		while(num > 0) {
			rem = num % 10;
			revNum = (revNum * 10) + rem;
			num = num / 10;
		}
		
		System.out.println("Reverse Number = " +revNum);
		if(revNum == temp) {
			System.out.println(+temp +" is a Palindrome");
		}
		else {
			System.out.println(+temp +" is not a Palindrome");
		}
		sc.close();

	}

}
