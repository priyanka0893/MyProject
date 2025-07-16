package java_program;

public class SingletonPrgm {

	// defining private instance
	private static SingletonPrgm instance;

	// defining private constructor
	private SingletonPrgm() {

	}

	// defining private method to create instance
	public static SingletonPrgm getInstance() {
		if (instance == null) {
			instance = new SingletonPrgm();
		}
		return instance;

	}

	public void showMessage() {
		System.out.println("Singleton instance method called!");
	}
}
