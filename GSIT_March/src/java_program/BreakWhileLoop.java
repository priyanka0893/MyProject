package java_program;

public class BreakWhileLoop {

	public static void main(String[] args) {
		 int num = 1;
		
		System.out.println("while condition statement");
		while(num < 10) {
			if( num == 5) {
				break;
			}
			System.out.println("Num value is : " +num);
			num++;
			
		}
	}

}
