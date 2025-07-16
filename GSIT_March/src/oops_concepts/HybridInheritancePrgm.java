package oops_concepts;

class P {
	public void gold() {
		System.out.println("Accessing Parent class property");
	}
	
}

class C1 extends P{
	public void shares() {
		System.out.println("Accessing child1 class property");
	}
	
}

class C2 extends P{
	public void funds() {
		System.out.println("Accessing child2 class property");
	}
	
}

class C3 extends C1{
	public void lands() {
		System.out.println("Accessing child3 class property");
	}
}


public class HybridInheritancePrgm {

	public static void main(String[] args) {
		
		//Accessing C3 and C1 with object of c3
		C3 c3 = new C3();
		c3.gold();
		c3.lands();
		
		//Accessing C2 and P with object of c2
		C2 c2 = new C2();
		c2.funds();
		c2.gold();
	}

}
