package package2;

public class DuplicateCharacters {

	public static void main(String[] args) {

		String str = "growskillit";
		boolean b[] = new boolean[str.length()];
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (b[i]) {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count = count + 1;
					b[j] = true;
				}
			}
			System.out.println("Occurance of " + ch[i] + " = " + count);
		}
	}
}
