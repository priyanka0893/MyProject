package strings_program;

public class CapitalizeChar {

	public static void main(String[] args) {
		String str = "java is a program";
		String words[] = str.split(" ");
		StringBuilder result = new StringBuilder();

		for(String word : words) {
			result = result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
		}
		System.out.println(result);
	}

}
