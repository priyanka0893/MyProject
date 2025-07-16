package java_program;

public class ContinueForStmts {

	public static void main(String[] args) {
		System.out.println("Continue statement");
		for (int j = 1; j <= 10; j++) {
			if (j == 7) {
				continue;
			}
			System.out.println("j value is " +j);
		}
	}

}
