package strings_program;

public class AppendZeroAtEnd {

	public static void main(String[] args) {
		String str = "230032778000323";
		String digitsRes = "";
		String zeroDigits = "";
		String res = "";
		
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i)>='1' && str.charAt(i)<='9') {
				digitsRes = digitsRes+str.charAt(i);
			}else {
				zeroDigits = zeroDigits+str.charAt(i);
			}
		}
		res = zeroDigits + digitsRes ;
		System.out.println("Sorted String = "+res);
	}

}
