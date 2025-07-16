package java_program;

public class WhileLoopStmt {

	public static void main(String[] args) {
		int num = 1;
		int i = 1;
		
		System.out.println("while condition statement");
		while(num < 10) {
			System.out.println("Num value is : " +num);
			num++;
			
		}
		
		System.out.println("do while condition statement");
		do {
			System.out.println("Num value is : " +i);
			i++;
		}
		while(i < 5);
	}
}
