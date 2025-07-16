package collections_program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class RemoveSpecificEle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> l1 = new ArrayList<Integer>();
		
		System.out.println("Enter the size of array list");
		int size = sc.nextInt();
		
		System.out.println("Enter the " +size+ "elements");
		for(int i = 0; i<size;i++) {
			int val = sc.nextInt();
			l1.add(val);
		}
		
		System.out.print("Array List is : ");
		for(int data : l1) {
			System.out.print(data +" ");
		}
		
		System.out.println("Enter the index to remove an element");
		int index = sc.nextInt();
		
		System.out.println();
		System.out.println("Element remove from index " +index+ " : " +l1.remove(index));
		
		
		System.out.println();
		System.out.print("Array List is : ");
		for(int data : l1) {
			System.out.print(data +" ");
		}
		sc.close();
	}
	

}
