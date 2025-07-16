package strings_program;

public class StringReplace {

	public static void main(String[] args) {
		String str = "I love my country";
		String s2 = "ele";
		String str1="";
		
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i) =='o' || str.charAt(i)=='O'){
				str1 = str1+s2;
			}else {
				str1 = str1+str.charAt(i);
			}
		}
		System.out.println(str1);
		
	}

}
