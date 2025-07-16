package strings_program;

public class StringBuilderPrgm {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Java");

		System.out.println("Appending sequence of characters : " + sb.append(" program"));
		System.out.println("Insert character sequence in a particular index : " + sb.insert(12, " is"));
		System.out.println("Sub string : " + sb.substring(3, 7));
		System.out.println("Length of String : " + sb.length());
		System.out.println("Replace characters range of index : " + sb.replace(7, 11, "world"));
		System.out.println("First index of character: " + sb.indexOf("j"));
		System.out.println("Last index of character : " + sb.lastIndexOf("a"));
		System.out.println("String reverse : " + sb.reverse());
		System.out.println("Delete character sequence : " + sb.delete(5, 10));
	}

}
