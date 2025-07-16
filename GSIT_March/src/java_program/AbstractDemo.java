package java_program;

abstract class FirstR{
	
	public abstract void m1();
	public abstract void m2();
	
	public void m3() {
		System.out.println("Inside m3");
	}
}

abstract class SecondR extends FirstR{

	@Override
	public void m1() {
		System.out.println("Inside m1");
		
	}	
}

public class AbstractDemo extends SecondR{
	@Override
	public void m2() {
		System.out.println("Inside m2");
		
	}
	
	public static void main(String[] args) {
		AbstractDemo a1 = new AbstractDemo();
		a1.m1();
		a1.m2();
		a1.m3();
		
	}

	

	
}
