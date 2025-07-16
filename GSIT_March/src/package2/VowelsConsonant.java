package package2;

public class VowelsConsonant {

	public static void main(String[] args) {
		String str = "Programming";
		int vowl = 0;
		int cons = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'
					|| str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
				vowl++;
			} else if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') ) {
				cons++;
			}

		}
		System.out.println("Vowels = " + vowl);
		System.out.println("Comsonants = " + cons);
	}

}
