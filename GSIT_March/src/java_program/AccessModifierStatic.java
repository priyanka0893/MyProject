package java_program;

public class AccessModifierStatic {
	
	public static int a = 10;
	private static int b = 20;
	protected static int c = 5;
	static int d = 3;

	public static void main(String[] args) {
		
		System.out.println("Access specifiers inside a class " + a * b * (c + d));
		
	}

}
