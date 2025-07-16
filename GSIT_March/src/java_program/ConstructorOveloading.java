package java_program;

public class ConstructorOveloading {

	int a;
	int b;
	int c;

	ConstructorOveloading() {
		System.out.println("Executing default constructor");
	}

	ConstructorOveloading(int m1, int m2) {
		a = m1;
		b = m2;
	}

	ConstructorOveloading(int m1, int m2, int m3) {
		a = m1;
		b = m2;
		c = m3;
	}

	public void add() {
		System.out.println("Sum of two integers = " + (a + b));
	}

	public void add1() {
		System.out.println("Sum of three integers = " + (a + b + c));
	}

	public void mult() {
		System.out.println("Multiplication of two integers = " + (a * b));
	}

	public void mult1() {
		System.out.println("Multiplication of three integers = " + (a * b * c));
	}

	public void display() {
		System.out.println("Executing method");
	}

	public static void main(String[] args) {

		ConstructorOveloading c1 = new ConstructorOveloading(2, 3);
		c1.add();
		c1.mult();

		ConstructorOveloading c2 = new ConstructorOveloading(3, 4, 5);
		c2.add1();
		c2.mult1();

		ConstructorOveloading c3 = new ConstructorOveloading();
		c3.display();
	}

}
