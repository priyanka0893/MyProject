package java_program;

public class OccuranceOfWord {
	public static void main(String[] args) {
		
		String str = "The words in the words with the words and are words";
		String[] words = str.split(" ");
		boolean[] b = new boolean[words.length];
		
		for(int i = 0; i<words.length ; i++) {
			if(b[i])
				continue;
			int c = 1;
			for( int j = i+1 ; j<words.length; j++) {
				if(words[i].equalsIgnoreCase(words[j])) {
					b[j] = true;
					c++;
				}
			}
			System.out.println(words[i] + " : " +c);
		}
		
	}
	
}
