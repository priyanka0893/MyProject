package strings_program;

public class ReverseEachWord {

	public static void main(String[] args) {
		String str = "java is a program";
		String words[] = str.split(" ");
		StringBuilder result = new StringBuilder();
		
		for(int i =0;i<words.length;i++) {
			StringBuilder sb = new StringBuilder(words[i]);
			sb.reverse();
			result = result.append(sb).append(" ");
		}
		System.out.println(result);
	}

}
