package oops_concepts;

public class EncapsulationPrgm {
	
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if( age < 18 || age > 60) {
			throw new RuntimeException("Age should be between 18 and 60");
		} else {
			System.out.println("Age = " +age);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.length() < 4 || name.length() > 10) {
			throw new RuntimeException("Name length should be between 4 and 10");
		} else {
			System.out.println("Name = " +name);
		}
	}

	public static void main(String[] args) {
		
		EncapsulationPrgm e1 = new EncapsulationPrgm();
		e1.setAge(31);
		e1.setName("Priyanka");
	}

}
