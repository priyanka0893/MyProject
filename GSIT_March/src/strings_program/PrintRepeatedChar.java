package strings_program;

public class PrintRepeatedChar {

	public static void main(String[] args) {
		String str = "javaav";
		String[] arr = str.split("");
		String s2 = "";

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
				}
					if (!s2.contains(arr[i])) {
						s2 = s2 + arr[i];
					}
				}
			}
		System.out.println("Repeated Characters in given string : " +s2);
		System.out.println("Second Repeated chracter : " +s2.charAt(0));
	}

}
