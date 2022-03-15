package feb22.maven.demo.mt;

// Multi-threading with Thread class

//public class App extends Thread {
public class App implements Runnable {
	void printNums() {

//		Thread.currentThread().setName("ABC");
		Thread.currentThread().setPriority(9);
		System.out.println(Thread.currentThread().getPriority());

		for (int i = 0; i <= 3; i++) {
			System.out.println(i + " - " + Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		this.printNums();
	}

	public static void main(String[] args) {

//		App app = new App();
//		app.start();
//		App app2 = new App();
//		app2.start();

		Thread app = new Thread(new App());
		Thread app2 = new Thread(new App());
		Thread app3 = new Thread(new App());

		app.start();
		app2.start();
		try {
			app2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		app3.start();

	}
}
