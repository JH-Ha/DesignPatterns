package ch5.singleton;

class BoilerThread extends Thread {
	public void run() {
		ChocolateBoiler chocolateBoiler1 = ChocolateBoiler.getInstance();
		ChocolateBoiler chocolateBoiler2 = ChocolateBoiler.getInstance();
		if (chocolateBoiler1 != chocolateBoiler2) {
			System.out.println("A different singleton object generated");
		}
	}
}

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();

		// the same object
		// System.out.println(singleton == singleton2);

		for (int i = 0; i < 10000; i++) {
			Thread boilerThread1 = new BoilerThread();
			Thread boilerThread2 = new BoilerThread();
			Thread boilerThread3 = new BoilerThread();
			Thread boilerThread4 = new BoilerThread();
			boilerThread1.start();
			boilerThread2.start();
			boilerThread3.start();
			boilerThread4.start();
			boilerThread1.join();
			boilerThread2.join();
			boilerThread3.join();
			boilerThread4.join();
			ChocolateBoiler.clear();
		}
	}
}
