package strings_program;

public class PrintEvenLengthStrings {

	public static void main(String[] args) {
		String str = "Java is a programming language and a high level language level";
		
		System.out.println("Even length words are : ");
		for (String words : str.split(" ")) {
			if (words.length() % 2 == 0) {
				System.out.print(words + " ");
			}
		}
	}

}
