package strings_program;

public class RemoveDuplicateWords {
	public static void main(String[] args) {
		String input = "string this is is a test test a this string";
		String[] words = input.split(" ");
		String result = "";

		for (int i = 0; i < words.length; i++) {
			boolean isDuplicate = false;

			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					isDuplicate = true;
					break;
				}
			}

			if (!isDuplicate) {
				result = result + words[i] + " ";
			}
		}

		System.out.println("Output: " + result.trim());
	}
}
