package strings_program;

public class StringPalindrome {

	public static void main(String[] args) {
		String str = "Java Programming";
		String revStr = "";
		
		for(int i = str.length()-1; i >=0; i--) {
			revStr = revStr + str.charAt(i);
		}
		System.out.println("Reversed string is : " +revStr);
		
		//Check if the strings are palindrome or not
			if(str.equalsIgnoreCase(revStr)) {
				System.out.println("Strings are palindrome");
			} else {
				System.out.println("Strings are not palindrome");
			}
	}

}
