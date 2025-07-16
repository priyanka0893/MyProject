package strings_program;

import java.util.Scanner;

public class PalindromePrgm {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		String revStr = "";

		System.out.println("Enter a string");
		str = sc.next();
		for (int i = str.length() - 1; i >= 0; i--) {
			revStr = revStr + str.charAt(i);
		}

		if (str.equals(revStr)) {
			System.out.println("Strings are palindrome : " + revStr);
		} else {
			System.out.println("Strings are not palindrome : " + revStr);
		}
		sc.close();
	}

}
