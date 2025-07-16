package oops_concepts;

public class MethodOverloadingPrgm {
	
	public void result(int rolNum) {
		System.out.println("Searching result with roll number");
	}
	
	public void result(String name) {
		System.out.println("Searching result with name");
	}
	
	public void result(int rolNum, String name) {
		System.out.println("Searching result with roll number and name");
	}
	public static void main(String[] args) {
		
		MethodOverloadingPrgm m1 = new MethodOverloadingPrgm();
		m1.result(10);
		m1.result("Priya");
		m1.result(10, "Priya");
	}

}
