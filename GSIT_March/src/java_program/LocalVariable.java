package java_program;

public class LocalVariable {

	public static void m1() {
		int a = 10;
		int b = 20;
		System.out.println("Local Variable access value : " + (a + b));
	}

	public static void main(String[] args) {
		m1();

		// Static variable within the package or different class access
		System.out.println("Static variable within the package " + (StaticNonStaticVariable.a + StaticNonStaticVariable.b));
		
		// Non Static variable within the package or different class
		StaticNonStaticVariable s1 = new StaticNonStaticVariable();
		System.out.println("Non static variable withing the package " +(s1.c % s1.d));
	}

}
