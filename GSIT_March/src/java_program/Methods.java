package java_program;

public class Methods {
	
	public static void m1() {
		int a = 10;
		int b = 12;
		System.out.println("Add of static method = " +(a+b));
		
	}
	
	public void m2() {
		int c = 2;
		int d = 3;
		System.out.println("Mult of non-method = " +(c*d));
	}

	public static void main(String[] args) {
		
		//Static method 
		m1();
		
		//Non Static method
		Methods obj = new Methods();
		obj.m2();
	}

}
