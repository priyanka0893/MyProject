package java_program;

public class Operators1 {
	public static void main(String[] args) {
//		System.out.println("Hello World");
		int a =10;
		int b =5;
		int c =5;
		int i =10;
		
		System.out.println(++i + i++ + i++ + ++i + i--);
		int Integer = 24;
		char String  = 'I';
		System.out.print(Integer);
		System.out.print(String);
		
		System.out.println(a++ + --b + a-- + ++a + b++ + --b);
		System.out.println(--a + b++ + b-- + a++ + ++b + ++b);
	     System.out.println(i++ + i-- + i-- + c++ + i--); 
	     System.out.println(c-- + c-- +c + i-- + i--); 
	     System.out.println(i--+ a-- + c-- + b-- + i--); 
	     
	     System.out.println(a+b+c+i);
	     System.out.println(a*c*i);
	     
	     System.out.println("=====================");
	     int[]  x = {120, 200, 016};
         for(int j = 0; j < x.length; j++){
                  System.out.print(x[j] + " ");
         }    
         
	}
}
