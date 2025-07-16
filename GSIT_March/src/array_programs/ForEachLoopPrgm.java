package array_programs;

public class ForEachLoopPrgm {
	public static void main(String args[]) {

		int[] age = { 28, 23, 19, 32, 38, 24, 28, 30 };
		int sum = 0;
		int avg = 0;
		int length = age.length;
		
		for (int a : age) {
			sum = sum + a;

		}
		System.out.println("Sum of age = " + sum);
		avg = sum / length;
		System.out.println("Avarage age = " + avg);

	}

}
