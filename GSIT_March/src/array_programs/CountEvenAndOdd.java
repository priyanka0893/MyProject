package array_programs;

public class CountEvenAndOdd {

	public static void main(String[] args) {
		
		int[] arr = {34, 56, 36, 12, 77, 87, 92, 44 ,31};
		int even = 0;
		int odd = 0;
		
		for(int data : arr) {
			if(data % 2 == 0) {
				even = even + 1;
			} else {
				odd = odd + 1;
			}
			
		}
		System.out.println(" Even count = " +even);
		System.out.println(" Odd count = " +odd);
		
	}

}
