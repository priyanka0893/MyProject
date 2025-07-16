package java_program;

public class ContinueDoWhile {

	public static void main(String[] args) {
		int i = 1;
		System.out.println("Continue in do while loop");
		do {
			i++;
			if(i ==5) {
				continue;
			}
			System.out.println(" i value is " +i);
		}
		while(i<10);
	}

}
