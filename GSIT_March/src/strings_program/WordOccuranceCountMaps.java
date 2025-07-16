package strings_program;

import java.util.HashMap;
import java.util.Map;

public class WordOccuranceCountMaps {

	public static void main(String[] args) {
		String str = "Java Programming Java Programming";
		String[] s1 = str.split(" ");

		Map<String, Integer> m1 = new HashMap<String, Integer>();

		for (int i = 0; i < s1.length; i++) {
			m1.put(s1[i], m1.getOrDefault(s1[i], 0) + 1);
		}

		System.out.println("Word occurance");
		for (Map.Entry<String, Integer> data : m1.entrySet()) {
			System.out.println(data.getKey() + " : " + data.getValue());
		}
	}

}
