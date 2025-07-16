package strings_program;

import java.util.HashMap;
import java.util.Map;

public class CountCharOccuranceMaps {

	public static void main(String[] args) {
		String str = "Java";
		char[] c = str.toCharArray();
		Map<Character, Integer> m1 = new HashMap<Character, Integer>();

		for (int i = 0; i < c.length; i++) {
			m1.put(c[i], m1.getOrDefault(c[i], 0) + 1);
		}

		System.out.println("Occurance");
		for (Map.Entry<Character, Integer> data : m1.entrySet()) {
			System.out.println(data.getKey() + " : " + data.getValue());
		}

	}

}
