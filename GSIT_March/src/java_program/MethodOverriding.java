package java_program;

class ParentOver {
	int i;
	public void display(int i) {
		System.out.println(i);
		this.i = i;
		System.out.println("display in parent calss" +i);
	}
}
public class MethodOverriding extends ParentOver {
	int j;
	public void display(int j) {
		System.out.println(j);
		this.j=j;
		System.out.println("display in child calss"+j);
		super.display(j);
	}
	

	public static void main(String[] args) {

		MethodOverriding m = new MethodOverriding();
		m.display(5);

	}

}
