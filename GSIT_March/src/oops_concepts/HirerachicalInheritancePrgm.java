package oops_concepts;


class Parent1 {
	public void gold() {
		System.out.println("Accessing Parent class property");
	}
	
}

class Child1 extends Parent{
	public void shares() {
		System.out.println("Accessing child1 class property");
	}
	
}

class Child2 extends Parent{
	public void funds() {
		System.out.println("Accessing child2 class property");
	}
	
}

public class HirerachicalInheritancePrgm {

	public static void main(String[] args) {
		
		//Accessing Parent class with object of child1 
		Child1 c1 = new Child1();
		c1.lands();
		c1.shares();
		
		//Accessing Parent class with object of child2
		Child2 c2 = new Child2();
		c2.lands();
		c2.funds();
	}

}
