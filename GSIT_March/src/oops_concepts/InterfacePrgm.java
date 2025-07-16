package oops_concepts;

interface School{
	public void startDate();
	public void endDate();
	public void fees();
	public String schoolname(String str);
}

public class InterfacePrgm implements School{
	
	String schoolname ="";
	@Override
	public void startDate() {
		System.out.println("School starts on June 2nd");
		
	}

	@Override
	public void endDate() {
		System.out.println("School ends on March 23rd");
	}

	@Override
	public void fees() {
		System.out.println("School fees is 60000");
	}
	
	@Override
	public String schoolname(String sname) {
		this.schoolname = sname;
		return schoolname;
	}
	
	public void sports() {
		System.out.println("Football classes");
	}
	public static void main(String[] args) {
		School sc = new InterfacePrgm(); //Upcasting - restricting accessing for only parent class methods
		sc.startDate();
		sc.endDate();
		sc.fees();
		System.out.println("School Name = " +sc.schoolname("St john's"));
	}

	

}
