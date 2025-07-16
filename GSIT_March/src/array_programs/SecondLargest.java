package array_programs;

public class SecondLargest {

	public void secondlar(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
	}
	public static void main(String[] args) {
		int[] arr = { 4, 5, 7, 11, 9, 13, 8, 12 , 17};
		
		SecondLargest s1= new SecondLargest();
		s1.secondlar(arr);
		System.out.println(arr[arr.length-2]);
		
	}

}
