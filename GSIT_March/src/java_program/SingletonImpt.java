package java_program;

public class SingletonImpt {
	public void display() {
		System.out.println("Message from Implemented class");
	}
	public static void main(String[] args) {
		
		//Calling Singleton class method
		SingletonPrgm s = SingletonPrgm.getInstance();
		s.showMessage();
		
		//Creating reference for Singleton implemented class and calling method
		SingletonImpt s1 = new SingletonImpt();
		s1.display();
	}

}



