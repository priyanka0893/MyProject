package java_program;

public class BreakDoWhileLoop {

	public static void main(String[] args) {
		 int j = 1;
		System.out.println("do while condition statement");
		do {
			if(j == 3) {
				break;
			}
			System.out.println("Num value is : " +j);
			j++;
		}
		while(j < 5);
	}

}
