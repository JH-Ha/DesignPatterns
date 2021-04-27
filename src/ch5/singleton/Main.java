package ch5.singleton;

public class Main {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();

		// the same object
		System.out.println(singleton == singleton2);

	}
}
