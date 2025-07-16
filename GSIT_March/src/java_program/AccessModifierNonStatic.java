package java_program;

public class AccessModifierNonStatic {
	
	public int a = 10;
	private int b = 20;
	protected int c = 5;
	int d = 3;

	public static void main(String[] args) {
		
		AccessModifierNonStatic a1 = new AccessModifierNonStatic();
		System.out.println("Access specifiers inside a class " + a1.a * a1.b * (a1.c + a1.d));
		
	}

}
