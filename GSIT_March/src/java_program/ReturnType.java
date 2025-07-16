package java_program;

public class ReturnType {

	//Method with static and int return type
	public static int m1() {
		int a = 10;
		int b = 2;
		int c = a*b;
		return c;
	}
	
	//Method with static and string return type
	public static String m2() {
		String s1 = "Hello";
		String s2 = "World";
		String s3 = s1.concat(s2);
		return s3;
	}
	
	//Method with non static and int return type
		public int m3() {
			int a = 10;
			int b = 2;
			int c = a*b;
			return c;
		}
		
		//Method with non static and string return type
		public  String m4() {
			String s1 = "Hello";
			String s2 = "World";
			String s3 = s1.concat(s2);
			return s3;
		}
		
	
	
	public static void main(String[] args) {
		
		//Method with static int return type
		System.out.println("Method with int return type = " +m1());
		
		//Method with static and String return type
		System.out.println("Method with String return type = " +m2());
		
			ReturnType r1 = new ReturnType();
			
		//Method with non static int return type
		System.out.println("Method with non static and int return type = " +r1.m3());
				
		//Method with non static and String return type
		System.out.println("Method with non static and String return type = " +r1.m4());
				
		
	}

}
