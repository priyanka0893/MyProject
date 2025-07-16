package java_program;

import java.util.Scanner;

public class ScannerProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("Enter the value of a : ");
		int a = sc.nextInt();
		
		System.out.println("Enter the value of b : ");
		int b = sc.nextInt();
		
		System.out.println("Enter the value of c : ");
		int c = sc.nextInt();
		
		System.out.println("Addition of a and b : " +(a+b+c));
		System.out.println("Multiplication of a and b : " +(a*b));*/
		
		
		System.out.println("Enter the firstname : ");
		String fn = sc.next();
		
		System.out.println("Enter the lastname : ");
		String ln = sc.next();
		
		System.out.println("Full name = " +fn + " " +ln);
		
		sc.close();
	}

}
