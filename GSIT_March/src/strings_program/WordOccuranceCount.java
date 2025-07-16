package strings_program;

public class WordOccuranceCount {

	public static void main(String[] args) {
		String str = "Java is a programming language and a high level language level";
		String[] arr = str.split(" ");
		int temp = 1;
		String s2 = "";

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					temp++;
				}
			}
			if (s2.contains(arr[i]) == false) {
				s2 = s2 + arr[i];
				System.out.println(arr[i] + " : " + temp);
			}
			temp = 1;
		}
	}

}
