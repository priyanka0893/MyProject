package java_program;

public class BreakForLoopStmt {

	public static void main(String[] args) {

		System.out.println("Break statement");
		for (int i = 1; i <= 10; i++) {
			if (i == 7) {
				break;
			}
			System.out.println("i value is " +i);
		}
	}

}
