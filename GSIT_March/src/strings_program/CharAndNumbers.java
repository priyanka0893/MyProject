package strings_program;

public class CharAndNumbers {

	public static void main(String[] args) {
		String str = "asd2132TfTjK$qwh*jdfj";
		String letters = "";
		String digits = "";
		String capital = "";
		String special = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				letters = letters + str.charAt(i);
			} else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				capital = capital + str.charAt(i);
			} else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				digits = digits + str.charAt(i);
			} else {
				special = special + str.charAt(i);
			}
		}
		System.out.println("Letters = " + letters);
		System.out.println("Numbers = " + digits);
		System.out.println("Capital Letters = " + capital);
		System.out.println("Special Symbols = " + special);

	}

}
