package strings_program;

public class SwappingOfStrings {

	public static void main(String[] args) {
		String a = "Java";
		String b = "Programming";
		String c = "";
		
		System.out.println("Swapping of two strings without 3rd variable");
		System.out.println("String before swapping : " +a +" " +b);
		
		a = a + b;
		
		b = a.substring(0,a.length()-b.length());
		a = a.substring(b.length());
		
		System.out.println("Strings after swapping : " +a +" " +b);
		System.out.println();
		
		System.out.println("Swapping with 3rd variable");
		System.out.println("String before swapping : " +a +" " +b);
		
		c = a;
		a = b;
		b = c; 
		
		System.out.println("Strings after swapping : " +a +" " +b);
		
	}

}
