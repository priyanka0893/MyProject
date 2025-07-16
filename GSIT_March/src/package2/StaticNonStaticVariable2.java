package package2;

import java_program.StaticNonStaticVariable;

public class StaticNonStaticVariable2 {

	public static void main(String[] args) {
		
		//Static variable access in other package
		System.out.println("Static variable access in another package " + (StaticNonStaticVariable.a + StaticNonStaticVariable.b));
		
		//Non static variable access in other package
		StaticNonStaticVariable s1 = new StaticNonStaticVariable();
		System.out.println("Non static variable access in another package " +(s1.c + s1.d));
	}

}
