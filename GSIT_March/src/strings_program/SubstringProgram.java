package strings_program;

public class SubstringProgram {

	public static void main(String[] args) {
		String s = "Manas Java and Selenium classes";
		String s1 = "The factorial of 15 is: 1307674368000";
		String[] arr = s.split(" ");

		// WAP to split String and print sub string where length of string is 3
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() == 3) {
				System.out.println(arr[i]);
			}
		}

		// WAP to split a string and print sub string which contains character "a"
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].contains("a")) {
				System.out.println(arr[i]);
			}
		}
		
		String arr2[] = s1.split(":");
		System.out.println(arr2[1].trim());
	}

}
