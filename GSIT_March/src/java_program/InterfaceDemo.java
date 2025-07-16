package java_program;

interface print{
	public void m1();
	public void m2();
	public void m3();
}

interface print1{
	public void m4();
}

interface print2{
	public void m5();
}
abstract class copy implements print,print1,print2{

	@Override
	public void m1() {
		System.out.println("Inside m1");
	}

	@Override
	public void m2() {
		System.out.println("Inside m2");
		
	}
}

public class InterfaceDemo extends copy{
	@Override
	public void m3() {
		System.out.println("Inside m3");
		
	}
	
	@Override
	public void m4() {
		System.out.println("Inside m4");
		
	}
	
	@Override
	public void m5() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		InterfaceDemo d1 = new InterfaceDemo();
		d1.m1();
		d1.m2();
		d1.m3();
		

	}

	
	

	

}
