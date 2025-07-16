package java_program;

public class ConstructorPrgm {
	int a;
	int b;

	// Default Constructor / constructor with no argument
	ConstructorPrgm() {
		System.out.println("Constructor is executed");
	}

	// Parameterized constructor
	ConstructorPrgm(int m1, int m2) {
		a = m1;
		b = m2;
	}

	public void m1() {
		System.out.println("Method is executed");
	}

	public void add() {
		System.out.println("Sum = " + (a + b));
	}

	public static void main(String[] args) {

		ConstructorPrgm c1 = new ConstructorPrgm();
		c1.m1();

		//Calling parameterized constructor by passing values for objects
		ConstructorPrgm c2 = new ConstructorPrgm(10, 20);
		c2.add();
	}

}
