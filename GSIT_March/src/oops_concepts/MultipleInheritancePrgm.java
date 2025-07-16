package oops_concepts;

interface Software1{
	public void startDate();
	public void endDate();
	public void fees();
}

interface Software2 extends Software1{       // Interface ------> extends --------> Interface
	public void subject();
	public void sports();
}

public class MultipleInheritancePrgm implements Software1,Software2{         // Class --------> implements -------> Interface

	@Override
	public void subject() {
		System.out.println("Java , Python , C#");
	}

	@Override
	public void sports() {
		System.out.println("Football , Volleyball , Badmition");
		
	}

	@Override
	public void startDate() {
		System.out.println("Starts on June 2nd");
		
	}

	@Override
	public void endDate() {
		System.out.println("Ends on March 23rd");
		
	}

	@Override
	public void fees() {
		System.out.println("Fees is 60000");
		
	}
	
	public void holidays() {
		System.out.println("Holidays from March 24th to June 1st");
	}
	
	public static void main(String[] args) {
		
		Software1 s1 = new MultipleInheritancePrgm(); 
		s1.startDate();
		s1.endDate();
		s1.fees();
		
		Software2 s2 = new MultipleInheritancePrgm();
		s2.startDate();
		s2.endDate();
		s2.fees();
		s2.subject();
		s2.sports();
		
		MultipleInheritancePrgm m1 = new MultipleInheritancePrgm();
		m1.startDate();
		m1.endDate();
		m1.fees();
		m1.subject();
		m1.sports();
		m1.holidays();

	}

}
