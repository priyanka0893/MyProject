package strings_program;

public class StringAssignment {

	public static void main(String[] args) {

		String a = "abcd";
		String b = "xyz";
		String c = "abcd xyz klmn 1234 4567";
		String[] c1 = c.split(" ");

		// Req1: length of the a variable should be greater than length of b and should
		// be less than length of c

		if (a.length() > b.length() && a.length() < c.length()) {
			System.out.println("String a length is greater than b and lesser than c");
		} else {
			System.out.println("Condition doesnot satisfy");
		}
		// Req2: concatenate a and b variables and verify length should be less than c
		// variable length or greater than 5
		String d = a.concat(b);
		if (d.length() < c.length() || d.length() > 5) {
			System.out.println("Concatenated string a and b length is lesser than c or greater than 5");
		} else {
			System.out.println("Condition doesnot satisfy");
		}

		// Req3: a variable should start with “ab” and b variable should not ends with
		// “yz”
		if (a.startsWith("ab") && b.endsWith("yz")) {
			System.out.println("String a starts with ab and string b ends with yz");
		} else {
			System.out.println("Condition doesnot satisfy");
		}
		// Req4: c variable should contains space and should not contains 9
		if (c.contains(" ") && c.contains("9") == false) {
			System.out.println("String c contains space and doesnot contain numeric 9");
		} else {
			System.out.println("Condition doesnot satisfy");
		}

		// Req5: 7th position in a c variable should be y or z and k should be available
		// in the either 10th or 11th positions.
		if (c.indexOf("y") == 6 || c.indexOf("z") == 6 && c.indexOf("k") == 9 || c.indexOf("k") == 10) {
			System.out.println("Condition satisfied");
		} else {
			System.out.println("Condition not satisfied");
		}

		// Req6: split c variable into multiple strings with “ ”(space) and verify
		// length of the array should be 4 or 5
		if (c1.length == 4 || c1.length == 5) {
			System.out.println("Legth of string is 4 or 5");
		} else {
			System.out.println("Condition not satisfied");
		}

		// Req7: After split verify first string(Index) of the c variable should be same
		// as a variable and should not be same as 3rd string (Index) of the c variable.
		if (c1[0].equals(a) && c1[0].equals(c1[2]) == false) {
			System.out.println("condition satisfied");
		} else {
			System.out.println("condition not satisfied");
		}

	}

}
