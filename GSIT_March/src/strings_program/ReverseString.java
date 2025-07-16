package strings_program;

public class ReverseString {

	public void stringReverse(String str) {
		String[] splitStr = str.split(" ");
		for(int i = splitStr.length-1; i >= 0; i--) {
			System.out.print(splitStr[i] +" ");
		}
	}
	
	public void charReverse(String str) {
		char[] ch = str.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
	}
	
	
	public static void main(String[] args) {
		String s = "Java is programming language used for coding";
		ReverseString r1 = new ReverseString();
		
		System.out.println("String reverse");
		r1.stringReverse(s);
		
		System.out.println();
		System.out.println("Character reverse");
		r1.charReverse(s);
		
	}

}
