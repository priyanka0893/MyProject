package strings_program;

public class StringFunctions2 {

	public static void main(String[] args) {
		String a = "abcdef";
		String b = "xyz1234";
		String c = "abcxy";

		// 1. Verify length of the A variable should be greater than length of the C
		// variable and should be less than length of the B variable.
		if (a.length() > c.length() && a.length() < b.length()) {
			System.out.println("String a length is greater than String c length and lesser than String b length");
		} else {
			System.out.println("Validation Failed");
		}

		// 2. A variable should not be same as B variable and C variable
		if (a.equalsIgnoreCase(b) && a.equalsIgnoreCase(c)) {
			System.out.println("String a is equal to String b and String c");
		} else {
			System.out.println("String a is not equal to String b and String c");
		}

		// 3. C variable should be same as A variable irrespective of the case.
		if (c.equalsIgnoreCase(a)) {
			System.out.println("String c is equal to String a");
		} else {
			System.out.println("String c is not equal to String a");
		}

		// 4. A variable should contains cd and should not contains xy
		if (a.contains("cd") && a.contains("xy")) {
			System.out.println("String validation failed");
		} else {
			System.out.println("String a contains cd and not xy");
		}

		// 5. Convert B variable into uppercase and verify it should contains “Z” &
		// should not contains “z”
		if (b.toUpperCase().contains("Z") && b.toUpperCase().contains("z")) {
			System.out.println("String validation failed");
		} else {
			System.out.println("String b is converted to Uppercase and contains Z and not z");
		}
	}
}
