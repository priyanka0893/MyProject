package oops_concepts;

	class GrandParent{
		public void lands() {
			System.out.println("Accessing Grand parent class property");
		}
		
	}

	class Parent extends GrandParent{
		public void gold() {
			System.out.println("Accessing Parent class property");
		}
		
	}

	class Child extends Parent{
		public void shares() {
			System.out.println("Accessing child class property");
		}
		
	}

	public class MultilevelInheritancePrgm {
		
	public static void main(String[] args) {
		
		//Accessing Grandparent, Parent and Child properties
		Child c1 = new Child();
		c1.lands();
		c1.gold();
		c1.shares();
		

	}

}
