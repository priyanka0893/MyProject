package java_program;

public class ContinueWhileLoop {

	public static void main(String[] args) {
		int  num = 1;
		
		System.out.println("Continue in while Loop");
		while(num < 10) {
			if(num == 3) {
				num++;
				continue;
			}
			System.out.println("num value is " +num);
			num++;
		}
	}

}
