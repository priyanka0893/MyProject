package oops_concepts;

class Parents{
	
	public void lands() {
		System.out.println("Accessing parent class property");
	}
}

class Childs extends Parents{
	public void gold() {
		System.out.println("Accessing clid class property");
	}
	
}

public class SingleInheritancePrgm {
	
	public static void main(String[] args) {
		
		//Accessing parent class by creating object of child class
		Childs c1 = new Childs();
		c1.lands();
		c1.gold();
		
		//Accessing only parent class 
		Parents p1 = new Parents();
		p1.lands();
	}

}
