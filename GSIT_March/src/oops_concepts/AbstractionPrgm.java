package oops_concepts;

abstract class FirstSchedule{
	public void classroom() {
		System.out.println("Classroom Training started");
	}
	
	public abstract void onlineClass();
	public abstract void corporateTraining();
}

abstract class SecondSchedule extends FirstSchedule{

	@Override
	public void onlineClass() {
		System.out.println("Online Training started");
	}
	
}
public class AbstractionPrgm extends SecondSchedule{
	@Override
	public void corporateTraining() {
		System.out.println("Corporate Training started");
	}
	public static void main(String[] args) {
		
		AbstractionPrgm a1 = new AbstractionPrgm();
		a1.classroom();
		a1.onlineClass();
		a1.corporateTraining();
	}

	

}
