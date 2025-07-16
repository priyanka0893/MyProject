package java_program;

public class ForLoopStmts {

	public static void main(String[] args) {
		int a = 2;

		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				System.out.println("Value is " + a * i);
			}
		}
		
		//Nested for loop
		for (int i = 1; i<5 ; i++) {
			for(int j = 1; j<5; j++) {
				System.out.println(i +" - " +j );
			}
		}
		

	}

}
