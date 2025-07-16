package java_program;

public class AccessModifierNonStatic1 {

	public static void main(String[] args) {
		
		AccessModifierNonStatic a1 = new AccessModifierNonStatic();
		System.out.println("Access modifiers public , private and default access of the variable oustide class "
				+ a1.a + a1.c + a1.d);
	}

}
