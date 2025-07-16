package strings_program;

import java.util.Scanner;

public class ReplaceCharAtIndex {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		str = sc.next();
		
		System.out.println("Enter the index and character to be replaced in string");
		int index = sc.nextInt();
		String replace = sc.next();
		
		str = str.substring(0, index) + replace + str.substring(index + 1);
		
		System.out.println(str);
		
		sc.close();
		
	}

}
