package java_program;

public class ConditionStmt {
 public static void main(String args[]) {
	 int a = 10;
	 int b = 20;
	 int c = 30;
	 int d = 40;
	 
	 if(a%2 == 0) {
		 System.out.println("Even number");
	 }
	 else {
		 System.out.println("Odd Number");
	 }
	 
	 if( a > b && a > c && a > d) {
		 System.out.println(" a is greater than b and c and d");
	 }
	 else if(b > a && b > c && b > d) {
		 System.out.println("b is greater than a and c and d");
	 }
	 else if(c > a && c > b && c > d ){
		 System.out.println("c is greater than a and b and d");
	 }
	 else {
		 System.out.println(" d is greater than a and b and c");
	 }
 }
}
