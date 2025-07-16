package package2;

public class VowelConsonant1 {

	public static void main(String[] args) {
		String str = "Programming";
		String str1 = "aeiouAEIOU";
		int vowl = 0;
		int cons = 0;

		String ch[] = str.split("");
		for (int i = 0; i < ch.length; i++) {
			if (str1.contains(ch[i])) {
				vowl++;
			} else {
				cons++;
			}
		}
		System.out.println("Vowels = " + vowl);
		System.out.println("Comsonants = " + cons);
	}

}
