package collections_program;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetPrgm {

	public static void main(String[] args) {
		Set<String> h1 = new HashSet<String>();
		
		//Adding elements into hashset
		System.out.println("Enter the size of set" );
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		System.out.println("Enter set elements");
		for(int i =0;i<size;i++) {
			String data = sc.next();
			h1.add(data);
		}
		
		for(String val : h1) {
			System.out.print(val+" ");
		}
		
		System.out.println();
		//Check if Set is empty or not 
		System.out.println("Set is empty or not : " +h1.isEmpty());
		
		//Fetching size of Set
		System.out.println("Size of Set = " +h1.size());
		
		sc.close();
	}
	

}
