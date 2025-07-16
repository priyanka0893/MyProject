package java_program;

public class StaticNonStaticVariable {
	
	//Static VAriable
	public static int a = 10;
	public static int b = 5;
	
	//Non static variable
	public int c = 6;
	public int d = 7;
	
	public static void main(String[] args) {
		
		//Accessing static variables
		System.out.println("Static variable within in the class " +(a+b));
		
		// Accessing non static variables
		StaticNonStaticVariable s1 = new StaticNonStaticVariable();
		System.out.println("Non static variable within the class " +(s1.c * s1.d));
		
	}

}
