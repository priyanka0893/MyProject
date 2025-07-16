package strings_program;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountWord {

	public static void main(String[] args) {
		String str = "java is a programming language java is a programming language";
		String words[] = str.split(" ");
		
		Map<String, Integer> m1 = new LinkedHashMap<String, Integer>();
		for(String word : words) {
			m1.put(word, m1.getOrDefault(word, 0) +1);
		}
		
		for(Map.Entry<String, Integer> val : m1.entrySet()) {
			System.out.println(val.getKey() +" : " +val.getValue());
		}
	}

}
