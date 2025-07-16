package strings_program;

import java.util.Scanner;

public class ReplaceCharcter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String value");

		String s = sc.nextLine();
		//asieoc -> @$!30(
		//tuwanii -> tuw@n!!

		String modString = s.replace("a", "@").replace("s", "$").replace("i", "!").replace("e", "3").replace("o", "0");
		
		System.out.println("Modified String = : " +modString);
		sc.close();
	}

}
