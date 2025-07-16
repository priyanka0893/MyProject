package strings_program;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateWord {

	public static void main(String[] args) {
		String str = "java is a Java a is prgm is a java";
		String words[] = str.toLowerCase().split(" ");
		
		Set<String> s1 = new LinkedHashSet<String>();
		for(String word : words) {
			s1.add(word);
		}
		
		for(String w1 : s1) {
			System.out.print(w1.toString() +" ");
		}
	}

}
