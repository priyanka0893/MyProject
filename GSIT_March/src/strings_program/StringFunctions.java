package strings_program;

public class StringFunctions {

	public static void main(String[] args) {
		String str = "Java Programming";
		String str1 = "JAVA PROGRAMMING";
		String str2 = "coding language";
		String str3 = "";
		
		System.out.println("The length of String is : " +str.length());
		
		System.out.println("String starts with Jav : "+str.startsWith("Jav"));
		System.out.println("String ends with ing : "+str.endsWith("ing"));
		
		System.out.println("String convert to Uppercase : "+str.toUpperCase());
		System.out.println("String convert to Lowercase : "+str.toLowerCase());
		
		System.out.println("String comparision :" +str.equals(str2));
		System.out.println("String comparision with ignorecase:" +str.equalsIgnoreCase(str1));
		
		System.out.println("Empty String validation : "+str3.isEmpty());
		
		System.out.println("String contains sequence of characters :" +str.contains("gra"));
		
		System.out.println("Contatination of two strings :" +str.concat(str2));
		
		System.out.println("Character at given index :" +str2.charAt(2));
		
		System.out.println("Index of given character :" +str2.indexOf("i"));
		
		
	}

}

