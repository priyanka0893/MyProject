package oops_concepts;


class Car{
	public void displayInfo() {
		System.out.println("This is Swift");
	}
}
 class Bus extends Car{
	 public void displayInfo() {
			System.out.println("This is Bus");
		}
	 
 }
public class MethodOverridingPrgm {

	public static void main(String[] args) {
		Bus b1 = new Bus();
		b1.displayInfo();
	}

}
