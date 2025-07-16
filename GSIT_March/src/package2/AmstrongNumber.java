package package2;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		int revNum = 0;
		int rem;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int temp = num;
		
		while(num > 0) {
			rem = num % 10;
			revNum = revNum + (rem * rem * rem);
			num = num / 10;
		}
		if(revNum == temp) {
			System.out.println(+temp +" is a Amstrong Number");
		}
		else {
			System.out.println(+temp +" is not a Amstrong Number");
		}
		sc.close();

	}

}
